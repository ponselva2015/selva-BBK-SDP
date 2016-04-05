package week6
//pattern matching exercise from week6
//Exercise 10.

import AtomicTest._

/**
 * @author skuppu01
 */
import com.atomicscala.AtomicTest._
//change explicit to return a Set

object ParamObject3 extends App {
def explicitSet(v1:Vector[Double]):Set[Double]={v1.toSet}
     
explicitSet(Vector(10.0, 20.0, 10.0)) is Set(10.0, 20.0)
explicitSet(Vector(1, 2, 3, 2, 3, 4)) is Set(1.0, 2.0, 3.0, 4.0)
 
 }
//The output got is as below
//Set(10.0, 20.0)
//Set(1.0, 2.0, 3.0, 4.0)