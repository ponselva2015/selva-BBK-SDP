/*
 * How can you prevent other developers from constructing new instances of your class? 
 * Provide appropriate examples to illustrate your answer.
 * singleton pattern restricts the instantiation of a class and
 *  ensures that only one instance of 
 * the class exists in the java virtual machine. 
 
Use  private constructor as shown below.

class Singleton {
    private static Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }
}
*/
