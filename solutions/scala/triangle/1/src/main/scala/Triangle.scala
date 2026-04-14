class Triangle(a: Double, b: Double, c: Double){
  def equilateral = if (a == 0 && b == 0 && c == 0) false; else (a == b) && (b == c)
  def isosceles = if(a + b >= c && b + c >= a && a + c >= b) ((a == b) || (b == c) || (a == c)); else false
  def scalene = if(a + b >= c && b + c >= a && a + c >= b) (a != b) && (b != c); else false
}