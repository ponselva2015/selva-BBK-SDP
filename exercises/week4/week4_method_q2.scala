
//week4 scala exercises.
object week4_method_q2 {
  def isArg1GreaterThanArg2(a:Double,b:Double):Boolean=
  {
    if (a>b) 
    {
      true
    } else
    {
      false
    }
     
  }
  def main(args:Array[String])
  {
    val t1 = isArg1GreaterThanArg2(4.1, 4.12)
    
     assert(t1==false,"4.1 is greater than 4.12 "+t1)
     println("4.1 is greater than 4.12 "+t1)
     
     val t2 = isArg1GreaterThanArg2(2.1, 1.2)
     assert(t2==true,"2.1 is greater than 1.2 "+t2)
      println("2.1 is greater than 1.2 "+t2)
  }
}
/*
4.1 is smaller than 4.12 false
2.1 is greater than 1.2 true
*/
