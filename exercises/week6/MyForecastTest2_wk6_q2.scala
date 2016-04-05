package week6
//pattern matching exercise from week6
//Exercise 2.

import AtomicTest._

/**
 * @author skuppu01
 */
object MyForecastTest2 extends App{
  
   def forecast(temp:Int):String=
   {
   
     temp match{
       case 100 => "Sunny"
       case 80  => "Mostly Sunny"
       case 50  => "Partly Sunny"
       case 20 => "Mostly Sunny"
       case 0  => "Cloudy"
       case _   => "Unknown"
       
     }
     
  }
   
  
    val sunnyData=Vector(100,80,50,20,0,15)
    for (i<-sunnyData)
    {
      println("forecast("+i+") is "+forecast(i))
   }
   
}

//I got the following output when executed this program.
/*
 forecast(100) is Sunny
forecast(80) is Mostly Sunny
forecast(50) is Partly Sunny
forecast(20) is Mostly Sunny
forecast(0) is Cloudy
forecast(15) is Unknown
 
 * 
 * */
 
