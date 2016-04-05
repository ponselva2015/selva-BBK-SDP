package week6
//pattern matching exercise from week6
//Exercise 10.

import AtomicTest._

class Item(val name:String,val price:Double )
//class accepts 2 parameters.
{
def cost(grocery:Boolean=false,medication:Boolean=false,taxrate:Double=0.10):Double=
{
  if(grocery || medication) price
  else
    price+(price*taxrate)
}
}

object ItemObject extends App
{
val flour=new Item(name="flour",4)
flour.cost(grocery=true) is 4
val sunscreen=new Item(name="suncsreen",3)
sunscreen.cost() is 3.3
val tv=new Item(name="television",500)
tv.cost(taxrate=0.06) is 530
}




