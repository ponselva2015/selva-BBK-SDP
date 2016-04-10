import com.atomicscala.AtomicTest._

object week7_map_reduce_q2 extends App{
    val v = Vector(1, 2, 3, 4)
    var retvec=for{i<-v} yield (i+1)
     println(retvec)
     
}
/* the output is
Vector(2, 3, 4, 5)
*/