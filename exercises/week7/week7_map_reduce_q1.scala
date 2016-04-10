import com.atomicscala.AtomicTest._

object week7_map_reduce_q1 extends App{
    val v = Vector(1, 2, 3, 4)
      v.map(n => n + 1) is Vector(2, 3, 4, 5)
      v.map(n=>((n*11)+10)) is Vector(21, 32, 43, 54)
    
        //the test failed.we are not able to replace foreach for map.output shown below.
      val v2 = Vector(1, 2, 3, 4)
      v2.foreach ( n =>((n*11)+10)) is Vector(21, 32, 43, 54)
  
  
     var retvec=for{i<-v2} yield (i*11+10)
     println(retvec)
}
/*
Vector(2, 3, 4, 5)
Vector(21, 32, 43, 54)
()
[Error] expected:
Vector(21, 32, 43, 54)
Vector(21, 32, 43, 54)
* 
*/
