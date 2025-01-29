package singleton;
/*
 * // lazy initialization
public class SingletonClass {
    // 1. making the constructor private so no one can access outside it to create objects
    private SingletonClass(){

    }

    static SingletonClass object;

    // 2. create a public method that create an object if the object is not already created
    public static SingletonClass getInstance(){ // if we don't make it static then we have to create an object upfront to access it.But we don't have a single object write now. that single object will be created in this current method. So making this method static we make the method belongs to the class. means it's now independent of objects and we can access it using class name.
        if (object == null) {
            object = new SingletonClass();
        }
        return object;
    }
}
 */

/*
 * // Eager initialization
public class SingletonClass {
    // 1. first creating the object upfront
    
    private static SingletonClass obj = new SingletonClass();
    // 2. private constructor
    private SingletonClass(){

    }
    // 3. public static method
    public static SingletonClass getInstance(){
        return obj;
    }
}

 * 
 */

// syncronized initialization
public class SingletonClass {
    // 1. making the constructor private so no one can access outside it to create
    // objects
    private SingletonClass() {

    }

    static SingletonClass object;

    // 2. create a public method that create an object if the object is not already
    // created
    public static SingletonClass getInstance() { // if we don't make it static then we have to create an object upfront
                                                 // to access it.But we don't have a single object write now. that
                                                 // single object will be created in this current method. So making this
                                                 // method static we make the method belongs to the class. means it's
                                                 // now independent of objects and we can access it using class name.
        if (object == null) {
            synchronized (object) {
                object = new SingletonClass();
            }
        }
        return object;
    }

}