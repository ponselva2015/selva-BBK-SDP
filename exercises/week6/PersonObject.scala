package week6
//pattern matching exercise from week6
//Exercise 10.

import AtomicTest._

case class Person(first:String,last:String,email:String)
object PersonObject extends App
{
val p = Person("Jane", "Smile", "jane@smile.com")
p.first is "Jane"
p.last is "Smile"
p.email is "jane@smile.com"
}

