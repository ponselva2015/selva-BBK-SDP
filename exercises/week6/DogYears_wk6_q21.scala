package week6
//pattern matching exercise from week6
//Exercise 16.
//anonymous function that calculates age in dog years (by multiplying years
//by 7). Assign it to a val and then call your function.

import AtomicTest._

/**
 * @author skuppu01
 */
 
object DogYears extends App
{
val dogYears1=(x: Int) => x *7

dogYears1(10) is 70
  
}
