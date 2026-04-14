class School {
  type DB = Map[Int, Seq[String]]
  
  private var database: DB = Map()
  
  def add(name: String, g: Int): Unit = {
    val current = database.getOrElse(g, Seq())
    val updated =
      if (current.contains(name)) current
      else current :+ name
    database = database + (g -> updated)
  }

  def db: DB = database

  def grade(g: Int): Seq[String] = database.getOrElse(g, Seq())

  def sorted: DB = {
    database
      .toSeq
      .sortBy(_._1)
      .map((x, y) => (x, y.sorted))
      .toMap
    //Map → toSeq → sortBy grade → map (trier les noms) → toMap
  }
  
}

