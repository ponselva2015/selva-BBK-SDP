package week6
//pattern matching exercise from week6
//Exercise 1.

import AtomicTest._

/**
 * @author skuppu01
 */
object MyForecastTest  {
  
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
   
   def main(args:Array[String])
   {
     forecast(100) is "Sunny"
     forecast(80) is "Mostly Sunny"
     forecast(50) is "Partly Sunny"
     forecast(20) is "Mostly Sunny"
     forecast(0) is "Cloudy"
     forecast(15) is "Unknown"
   }
   
}

//When run i got the following results

/*
Sunny
Mostly Sunny
Partly Sunny
Mostly Sunny
Cloudy
Unknown
*/