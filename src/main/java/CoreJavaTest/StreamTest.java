package CoreJavaTest;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamTest {

    public static void main(String[] args) {
        // Get Least value
        List<Integer> lstInt = Arrays.asList(1,29,34,556,67,8,-90,10,-7);
        boolean lsrst = lstInt.stream().isParallel();
        System.out.println(lsrst);
        System.out.println("-----------------------------------");

        List<String> strLst = Arrays.asList("Ramesh", "Kavin", "Amutha", "Laxshana", "Ramesh Pongi");
        Map<String, Long> getStrGroup = strLst.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(getStrGroup);
        System.out.println("--------------------------------------");
        System.out.println("Get String Length");
          Map<Integer,List<String>> lngStr =  strLst.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(lngStr);
        System.out.println("--------------------------------------");
        List<String> ss = strLst.stream().sorted(Comparator.comparing(String::length).thenComparing(Comparator.reverseOrder())).collect(Collectors.toList());
        System.out.println(ss);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        String s = "PongiRameshannan";
        String s1 = "Ramesh";
        System.out.println(s.contains(s1));
        System.out.println(s.equals(s1));
        System.out.println(s==s1);
    }
}
