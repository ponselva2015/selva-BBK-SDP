package week6
//pattern matching exercise from week6
//Exercise 16.

import AtomicTest._


 class Vector(v:Person2)
case class Person2(first:String,last:String,email:String)

object PersonObject2 extends App
{
val people = Vector(
Person("Jane","Smile","jane@smile.com"),
Person("Ron","House","ron@house.com"),
Person("Sally","Dove","sally@dove.com"))

people(0) is "Person(Jane,Smile,jane@smile.com)"
people(1) is "Person(Ron,House,ron@house.com)"
people(2) is "Person(Sally,Dove,sally@dove.com)"
}

