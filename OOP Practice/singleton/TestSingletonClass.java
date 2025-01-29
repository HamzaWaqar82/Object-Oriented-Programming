package singleton;

public class TestSingletonClass {
    public static void main(String[] args) {
        // SingletonClass class1 = new SingletonClass();  this gives error coz we can't access consructor and create a new object
    
    // both 2 objects refer to the single object that is created in the SingletonClass
    SingletonClass sinObject1 = SingletonClass.getInstance();
    SingletonClass sinObject2 = SingletonClass.getInstance();

    //test 
    System.out.println(sinObject1.hashCode());
    System.out.println(sinObject2.hashCode());

    }

}
