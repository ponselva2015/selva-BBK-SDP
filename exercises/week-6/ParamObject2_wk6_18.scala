package week6
//pattern matching exercise from week6
//Exercise 10.

import AtomicTest._

/**
 * @author skuppu01
 */
import com.atomicscala.AtomicTest._
//alter explicit to take a Vector and create and return a List.

object ParamObject2 extends App {
def explicitList(v1:Vector[Double]):List[Double]={v1.toList }
     
 explicitList(Vector(10.0, 20.0)) is List(10.0, 20.0)
 explicitList(Vector(1, 2, 3)) is List(1.0, 2.0, 3.0)
 }
 }


//when run i got the following output 
//List(10.0, 20.0)
//List(1.0, 2.0, 3.0)