//scala week4 exercises..

object week4_expression_q3 {
  
  def main(args:Array[String])
  {
  val sky="partly cloudy"
  val temp=10
  
 // if((sky.equals("Sunny") || sky.equals("partly cloudy"))&& temp>80)
  if((sky.equals("Sunny") || sky.equals("partly cloudy"))&& ((temp>80) || (temp<20)))
      {
      println("TRUE:The sky is "+sky+" and the temperature is "+temp)
      }
  else
  {
    println("FALSE:The sky is "+sky+" and the temperature is "+temp)
  }
  }
  
}
/* following is the  output when run.
TRUE:The sky is partly cloudy and the temperature is 10
*/