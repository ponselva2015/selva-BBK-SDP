package week6

class Flare 
{
//method has one method which when called returns a string.
def light():String="Flare Used!"
}

object flareObject
{
def main(args:Array[String])
{
val flare = new Flare
val f1 = flare.light()
assert(f1 == "Flare Used!", "Expected Flare used!, Got " + f1)
println(f1)
}
}
//when run i get the following output
//Flare Used!