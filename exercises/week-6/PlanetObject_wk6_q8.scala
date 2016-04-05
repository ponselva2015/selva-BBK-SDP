package week6
//pattern matching exercise from week6
//Exercise 3.

import AtomicTest._
//work through the constructor values 
//with the function that returns the value based on data passed during object creation.
//default value set in the constructor.
class Planet(val name:String,val description:String,val moons:Int=1 )
{
def hasMoon():Boolean=
{
  if (moons>0) true
  else {false}
 }
}

object PlanetObject extends App
{
val p=new Planet(name="Mercury",description="small and hot planet",moons=0)
println("The Name of the nplanet is "+p.name)
p.hasMoon() is false
}

