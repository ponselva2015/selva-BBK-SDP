//scala-week4 .methods inside classes.

class Flare
{
//create a new class called Flare
def light():String={"Flare used!"}
}
//new class of same type as in previous exercise
class Sailboat2
{
def raise():String={"Sails raised"}
def lower():String={"Sails lowered"}
 def signal():String = {new Flare().light()}
}
class Motorboat2
{
def on():String={"Motor on"}
def off():String={"Motor off"}
def signal():String = {new Flare().light()}
}
object obj_sailboat_motor2
{
def main(args:Array[String])
{
val sailboat2 = new Sailboat2
val signal = sailboat2.signal()
//printing value of signal to check output
println(signal)
assert(signal == "Flare used!", "Expected Flare used! Got " + signal)
val motorboat2 = new Motorboat2
val flare2 = motorboat2.signal()
//printing value of flare2 to check output
println(flare2)
assert(flare2 == "Flare used!", "Expected Flare used!, Got " + flare2)
}
}
//when i run this program i get the following output.
//Flare used!
//Flare used!
