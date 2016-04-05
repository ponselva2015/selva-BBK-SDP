
package week6
//pattern matching exercise from week6
//Exercise 3.

import AtomicTest._
//the class constructor takes 2 arguements.
class SimpleTime(val hours:Int,val minutes:Int)

object SimpleTimeObject  extends App
{
  //object created and pass the values to parameters defined in the class 
val t=new SimpleTime(hours=5,minutes=30)
//access the passed values fromn the class object.
t.hours is 5
t.minutes is 30
}

