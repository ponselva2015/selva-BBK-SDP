//week4 scala exercises.

object week4_method_q3 {
  
  def manyTimesString(a:String,b:Int):String=
  {
    //method returns the string many times as b.
   a*b
   }
  def main(args:Array[String])
  {
    
     val m1 = manyTimesString("abc", 3)
     assert("abcabcabc" == m1, "Your message here")
     println("Your message "+m1)
     
     val m2 = manyTimesString("123", 2)
     assert("123123" == m2, "Your message here")
          println("Your message "+m2)
  }
  
}
/*
Your message abcabcabc
Your message 123123
*/