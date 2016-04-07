/*
 author:selva kuppusamy
 Lazy initialization method to implement 
 Singleton pattern creates the instance in the global access method.
 Lazy initialization means that we do not initialize objects 
 until the first time they are used. 
 
public class LazySingleton {
 
    private static LazySingleton instance;
     
    private LazySingleton(){}
     
    public static LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
*/