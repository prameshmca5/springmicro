package CoreJavaTest;

public class SingletonDemo {

    // create private static instance
   private static SingletonDemo instance = new SingletonDemo();

   // create private constructor
    private SingletonDemo() {  }

    // created GetInstaince to return instance variable
    public static SingletonDemo getInstance() {
        return instance;
    }

    public void getMessage(){
        System.out.println("Hello world!");
    }



}
