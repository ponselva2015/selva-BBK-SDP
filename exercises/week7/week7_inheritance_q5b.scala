
trait Shape2
{
 def  sides():Int
 def perimeter():Double
 def area():Double
}

class Circle2(r:Int) extends Shape2
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

  class Rectangular(l:Int,b:Int) extends Shape2
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
  

  
    
object week7_inheritance_q5b extends App {
  val radius=3
  val c1=new Circle2(radius)
  c1.sides()
  c1.perimeter()
  c1.area()
  println("Circle side "+c1.sides()+"	perimeter "+c1.perimeter()+"	area "+  c1.area())
  
  val l=10
  val b=3
   
  val r1=new Rectangular(l,b)
  r1.sides()
  r1.perimeter()
  r1.area()
  println("Rectangle side "+r1.sides()+"	perimeter "+r1.perimeter()+"	area "+  r1.area())
  
    val s=10

  val s1=new Rectangular(s,s)
  s1.sides()
  s1.perimeter()
  s1.area()
    println("Square side "+s1.sides()+"	perimeter "+s1.perimeter()+"	area "+  s1.area())
  }