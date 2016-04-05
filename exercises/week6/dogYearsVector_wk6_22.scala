package week6
//pattern matching exercise from week6
//Exercise 16.
//anonymous function that calculates age in dog years (by multiplying years
//by 7). Assign it to a val and then call your function.

//Create a Vector and append the result of dogYears to a String for each value in
//the Vector.

import AtomicTest._

/**
 * @author skuppu01
 */
 //Create a Vector and append the result of dogYears
//to a String for each value in the Vector.
object dogYearsVector extends App
{
val dogYears1=(x: Int) => x *7

var s = ""
val v = Vector(1, 5, 7, 8)
v.foreach((x: Int) =>s=s+dogYears1(x)+" ")
s is "7 35 49 56 "
  
}
//When run the program gives the following output
//7 35 49 56 

