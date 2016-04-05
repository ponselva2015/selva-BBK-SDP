package week6
//pattern matching exercise from week6
//Exercise 3.

import AtomicTest._
//constructor defined with 2 parameters.one parameter with default value.
class SimpleTime2(val hours:Int,val minutes:Int=0)

object SimpleTimeObject2  extends App
{
  //no value passed for 2nd parameter.
val t2=new SimpleTime2(hours=10)
t2.hours is 10
//the default value is printed.
t2.minutes is 0
}

