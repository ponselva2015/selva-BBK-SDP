class Sailboat_new
{
//methods to raise and lower sails
def raise():String={"Sails raised"}
def lower():String={"Sails lowered"}
}

class Motorboat_new
{
//method to start the motor
def on():String={"Motor on"}
//method to stop the motor.
def off():String={"Motor off"}
}

object obj_sailboat_new {
  def main(args:Array[String])
  {
    
    //initialise the sailboat class(object)
    val sailboat=new Sailboat_new()
     //initialise the motorboat class(object)
    val motorboat=new Motorboat_new()

    //call the relevant methods
    
val r1=sailboat.raise()
val r2=sailboat.lower()

val s1=motorboat.on()
val s2=motorboat.off()

 assert(r1 == "Sails raised", "Expected Sails raised, Got " + r1)
 println(r1)
 assert(r2 == "Sails lowered", "Expected Sails lowered, Got " + r2)
 println(r2)

 assert(s1 == "Motor on", "Expected Motor on, Got " + s1)
 println(s1)
 assert(s2 == "Motor off", "Expected Motor off, Got " + s2)
 println(s2)

  }
}

/* when i eexcute the above program i get the following output.
 Sails raised
Sails lowered
Motor on
Motor off
 */
