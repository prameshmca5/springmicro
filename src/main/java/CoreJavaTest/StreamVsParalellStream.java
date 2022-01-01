package CoreJavaTest;

import java.util.*;

public class StreamVsParalellStream {

    public static void main(String[] args) {

        // Sequence Stream in Normal Stream
        List<Integer> intVal = Arrays.asList(1,2,3,4,5);
        intVal.stream().forEach(num->System.out.println(num+" "+Thread.currentThread().getName()));

        System.out.println("===========================================================================");
        // Parallel Stream checking
        List<Integer> paralInt = Arrays.asList(1,2,3,4,5);
        paralInt.parallelStream().forEach(numpar->System.out.println(numpar+" "+Thread.currentThread().getName()));
    }
}
