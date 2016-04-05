package week6
//pattern matching exercise from week6
//Exercise 2.

import AtomicTest._
//accepts arguement for mom and dad and vararg for kids.

class FlexibleFamily(mom:String,dad:String,kids:String*)
{
def familySize():Int={
  var memcount=2
  for(i<-kids)
  {
   memcount=memcount+1
  }
  memcount
  
}  
}

object Testargs2
{
def main(args:Array[String]) 
{
  //new class for 4 members
val family1=new  FlexibleFamily("Mum","Dad","Sally","Dick")
family1.familySize() is 4
//new class for 3 members.
val family2=new  FlexibleFamily("Dad","Mom","Harry")
family2.familySize() is 3

}
}

//When i run this program i got the following output
/*
4
3
*/