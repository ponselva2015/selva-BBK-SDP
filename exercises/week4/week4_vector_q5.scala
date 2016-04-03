import com.atomicscala.AtomicTest._

object week4_vector_q5 extends App{
val myVector1=Vector(1,2,3,4,5,6)
val myVector2=Vector(1,2,3,4,5,6)
println("myVector1"+myVector1)
println("myVector2"+myVector2)
assert(myVector1==myVector2,"The vectors are equal"+myVector1)
}
/* following is the output got
 * myVector1Vector(1, 2, 3, 4, 5, 6)
myVector2Vector(1, 2, 3, 4, 5, 6)
 */


