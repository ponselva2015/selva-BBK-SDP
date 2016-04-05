
package week6
//pattern matching exercise from week6
//Exercise 5.

import AtomicTest._


object squareAndSum extends App
{

def squareThem(i:Int*)={
  //initialise the sum to 0
    var square=0
    //loop through the values.square them then add.
    for (j<-i)
    {
      square=square+j*j
    }
    square
  }

 squareThem(2) is 4
 squareThem(2,4) is 20
  squareThem(1,2,4) is 21
  
}


//When i run this program i got the following output
/*
4
20
21
*/