
//scala week4 exercise

object week4_class_object_q1 {
  def main(args:Array[String])
  {
    //range with start and end
    val ran1=Range(0,20)
    println("range-nostep"+"	"+ran1)
    
    //range with start ,end and step value
    val ran2=Range(0,20,2)
    println("range-with step"+"	"+ran2)
  }
}
/* when i run the above,i got the following output.
range-nostep	Range(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19)
range-with step	Range(0, 2, 4, 6, 8, 10, 12, 14, 16, 18)
*/