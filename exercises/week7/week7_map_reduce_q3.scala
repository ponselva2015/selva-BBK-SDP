import com.atomicscala.AtomicTest._

object week7_map_reduce_q3 extends App{

  val v = Vector(1, 10, 100, 1000)
  val sumIt=(x:Int,y:Int)=>{x+y}
  println(v.reduce(sumIt))
    }
/* the output is
1111
*/