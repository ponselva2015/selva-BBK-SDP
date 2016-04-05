package week6
//pattern matching exercise from week6
//Exercise 3.

import AtomicTest._

class Planet2(val name:String,val description:String,val moons:Int=1 )
{
def hasMoon():Boolean=
{
  if (moons>0) true
  else {false}
 }
}

object PlanetObject2 extends App
{
val p=new Planet2(description="small and hot planet",moons=1,name="a hospitable planet")
println("The Name of the nplanet is "+p.name)
println("The planet has moon? "+p.hasMoon())
}

