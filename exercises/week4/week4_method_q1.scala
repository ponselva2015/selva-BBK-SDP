//week4 scala exercises.

object week4_method_q1 {
  
  def getSquare(s:Int):Int=
  {
    s*s
  }
  def main(args:Array[String])
  {
    val a = getSquare(3)
    println("The square of 3 is "+a)
     assert(a==9,"the square is 9 "+a)

     val b = getSquare(6)
     println("The square of 6 is "+b) 
     assert(b==36,"the square is 36 "+b)
     
     val c = getSquare(5)
     println("The square of 5 is "+c) 
     assert(c==25,"The square is 25 "+c)
  }
}
/*
The square of 3 is 9
The square of 6 is 36
The square of 5 is 25
* 
* */

