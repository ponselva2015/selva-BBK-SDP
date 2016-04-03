import com.atomicscala.AtomicTest._

class Cup3{
  //initialise the variables
  var percentFull=0
  val max=100
  //method to increase the value when the class method is called
  def add(increase:Int):Int={
    percentFull += increase
    //if the percentFull value goes to 100 or more then return 100.
    //here 
    if(percentFull>max)
    {
      percentFull=max
    }
    //if the percentfull goes negative then set percentfull to 0.
    if (percentFull<0)
    {
      percentFull=0
    }
    percentFull //return this value
    
  }

  
}

object Cup_Fields_wk4_q3 extends App
{
     val cup = new Cup3
     //set the value to 56
     cup.percentFull = 56
     //need to get back the same value set..
     cup.percentFull is 56
}
//When i run the above program , i get the following output
/*
56
 
 */

