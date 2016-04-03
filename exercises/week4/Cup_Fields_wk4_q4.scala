import com.atomicscala.AtomicTest._

class Cup4{
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
  //method to set the value of percentFull
  def set(pf:Int)
  {
    percentFull=pf
  }
  //method to get the value of percentFull
def get():Int=
{
  percentFull
}
  
}

object Cup_Fields_wk4_q4 extends App
{

     val cup = new Cup4
     //set the value to 56
     cup.set(56)
     //get the value that was set.
     cup.get() is 56
}
//When i run the above program , i get the following output
/*
56
 
*/
