package week6
//pattern matching exercise from week6
import AtomicTest._
//anonymous function to square a list of numbers.
//Call the function for every element in a Vector

/**
 * @author skuppu01
 */
object ListSquare_q23 {
  
}

object ListSquare extends App
{
 
var s = ""
val numbers = Vector(1, 2, 5, 3, 7)
numbers.foreach((x:Int)=>(s=s+(x*x)+" "))
s is "1 4 25 9 49 "

}

