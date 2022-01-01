package CoreJavaTest;

public class LambdaExpPractice {
    public static void main(String[] args) {

        // Thread
        Runnable runnable = ()->runRunnableMethod();
        Thread  thread = new Thread(runnable);
        System.out.println(thread.hashCode());
        thread.start();

        // Get Boolean check into Functional Interface



    }

    private static void runRunnableMethod() {
        System.out.println("Welcome start Lambda Expressions.");
    }


}
