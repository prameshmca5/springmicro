package CoreJavaTest;

public class SingletonDemo2 {

    private SingletonDemo2(){
    }

    private static SingletonDemo2 instance = new SingletonDemo2();

    public static SingletonDemo2 getInstance() {
        return instance;
    }

    public String getMessage() {
        return "Singleton Class created";
    }
}

