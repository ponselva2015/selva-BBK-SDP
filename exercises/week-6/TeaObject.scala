package week6
//pattern matching exercise from week6
//Exercise 10.

import AtomicTest._

class Tea(decaf:Boolean=false,milk:Boolean=false,name:String="Earl Grey",sugar:Boolean=false)
{

 
  def describe():String={
    var teadesc:String=name
      
    if (milk){teadesc=teadesc+" + milk"}
    if (decaf){teadesc=teadesc+" decaf"}
    if (sugar){teadesc=teadesc+" + sugar"}
    teadesc
  
  }
  
  def calories():Int={
    var  cal:Int=0
    if(milk) {cal+=100} 
    if(sugar) { cal+=16}
 
    cal
    //which adds 100 calories for milk and 16 calories for sugar.
  }
}

object TeaObject extends App
{
val tea = new Tea
tea.describe is "Earl Grey"
tea.calories is 0

val lemonZinger = new Tea(decaf = true, name="Lemon Zinger")
lemonZinger.describe is "Lemon Zinger decaf"
lemonZinger.calories is 0

val sweetGreen = new Tea( name="Jasmine Green", sugar=true)
sweetGreen.describe is "Jasmine Green + sugar"
sweetGreen.calories is 16

val teaLatte = new Tea(sugar=true, milk=true)
teaLatte.describe is "Earl Grey + milk + sugar"
teaLatte.calories is 116
}
/*
 Following is the output
 Earl Grey
0
Lemon Zinger decaf
0
Jasmine Green + sugar
16
Earl Grey + milk + sugar
116
 
 * /
 */


