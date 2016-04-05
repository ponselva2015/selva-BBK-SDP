package week6
//pattern matching exercise from week6
//Exercise 10.

import AtomicTest._

/**
 * @author skuppu01
 */
object ParamObject1 extends App {


def explicitDouble(v1:Double, v2:Double, v3:Double):Vector[Double] = {

  Vector(v1, v2, v3)

}
  explicitDouble(1,2,3) is Vector(1.0,2.0,3.0)



}

//when run i got the following output 
//Vector(1.0,2.0,3.0)