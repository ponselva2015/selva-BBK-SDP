
import com.atomicscala.AtomicTest._
object week4_vector_q3 extends App{
  val v1=Vector("The","dog","visited","the","fire","station")
  var sentence=""
 for(a<-v1) 
 {
   println(a)
   sentence+=a+" "
 }
  println("The sentence is "+sentence)
  
     sentence.toString() is "The dog visited the fire station "
}
/*
when run the following output is shown
The
dog
visited
the
fire
station
The sentence is The dog visited the fire station 
The dog visited the fire station 


*/