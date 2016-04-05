package week6
//pattern matching exercise from week6
//Exercise 10.

import AtomicTest._


class ClothesWasher(val modelName:String,val capacity:Double)
{
  def this(modelName:String)
  {
    this(modelName,20.0)
  }
  
  def this(capacity:Double)
  {
    this("Zanuizzi",capacity)
  }

}  
 
object ClothesWasherObject extends App
{
val p=new   ClothesWasher(30)
println("Model Name "+p.modelName+" "+"Capacity "+p.capacity)


val p1=new   ClothesWasher("Brothers")
println("Model Name "+p1.modelName+" "+"Capacity "+p1.capacity)
}

/*
 * Zanuizzi
30.0
Brothers
20.0
 * 
 */
