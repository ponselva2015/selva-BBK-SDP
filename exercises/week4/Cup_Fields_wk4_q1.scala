
package week4
//pattern matching exercise from week4
//Exercise 10.

import AtomicTest._


class Cup{
  //initialise the variables
  var percentFull=0
  val max=100
  //method to increase the value when the class method is called
  def add(increase:Int):Int={
    percentFull += increase
    //if the percentFull value goes to 100 or more then return 100.
    //here if the percentfull goes negative then it is not handled..
    if(percentFull>max)
    {
      percentFull=max
    }
    percentFull //return this value
    
  }
}

object Cup_Fields_wk4_q1 extends App
{
  val cup=new Cup()
  cup.add(45) is 45
  cup.add(-15) is 30
  cup.add(-50) is -20
}
//When i run the above program , i get the following output
/*
 45
30
-20
 
 */
