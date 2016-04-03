
//scala week4 exercises.
object week4_vector_q2 {
  def main(args:Array[String])
  {
    val v1=Vector(1,2,3,4,5,6)
    println(v1)
    
    
    val v2=Vector("a","b","test","london")
    println(v2)
    
    val v3=Vector(v1,v2)
    println(v3)
    
  }
}
/* following is the output.
Vector(1, 2, 3, 4, 5, 6)
Vector(a, b, test, london)
Vector(Vector(1, 2, 3, 4, 5, 6), Vector(a, b, test, london))
*/
