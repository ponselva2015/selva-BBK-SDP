
trait Shape
{
 def  sides():Int
 def perimeter():Double
 def area():Double
}

class Circle(r:Int) extends Shape
{
  def sides():Int=0
  def perimeter():Double=
  {
    2*3.14*r
  }
  def area():Double={
    3.14*r*r
  }
  }

  class Rectangle(l:Int,b:Int) extends Shape
  {
    def sides():Int=
    {
     4
    }
    def area():Double={
      l*b
    }
    def perimeter():Double={
      (2*l)+(2*b)
    }
  }
  
    class Square(l:Int) extends Shape
  {
    def sides():Int=
    {
     4
    }
    def area():Double={
      l*l
    }
    def perimeter():Double={
  4*l
    }
  }
    
object week7_inheritance_q5 extends App {
  val radius=3
  val c1=new Circle(radius)
  c1.sides()
  c1.perimeter()
  c1.area()
  println("Circle side "+c1.sides()+"	perimeter "+c1.perimeter()+"	area "+  c1.area())
  
  val l=10
  val b=3
  
  val r1=new Rectangle(l,b)
  r1.sides()
  r1.perimeter()
  r1.area()
  println("Rectangle side "+r1.sides()+"	perimeter "+r1.perimeter()+"	area "+  r1.area())
  
    val s=10

  val s1=new Square(s)
  s1.sides()
  s1.perimeter()
  s1.area()
    println("Square side "+s1.sides()+"	perimeter "+s1.perimeter()+"	area "+  s1.area())
  }