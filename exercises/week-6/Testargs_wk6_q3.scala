package week6
//pattern matching exercise from week6
//Exercise 2.

import AtomicTest._

class Family(housemembers:String*)
{
  //function to loop through the vararg and count the members.Returns memcount.
def familySize():Int={
  var memcount=0
  for(i<-housemembers)
  {
   memcount=memcount+1
  }
  memcount
  
}  
}

object Testargs extends App
{
//create a new object of family class and pass the family members.
val family1=new  Family("Mum","Dad","Sally","Dick")
family1.familySize() is 4
//new object for 3 members.
val family2=new  Family("Dad","Mom","Harry")
family2.familySize() is 3

}

//When i run this program i got the following output
/*
4
3
*/