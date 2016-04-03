import com.atomicscala.AtomicTest._

class Cup2{
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

object Cup_Fields_wk4_q2 extends App
{
val cup = new Cup2
     cup.add(45) is 45
     cup.add(-55) is 0
     cup.add(10) is 10
     cup.add(-9) is 1
     cup.add(-2) is 0
}
//When i run the above program , i get the following output
/*
45
0
10
1
0
 
 */
