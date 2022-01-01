package CoreJavaTest;

import org.springframework.beans.factory.annotation.Autowired;
import streamjavatest.Employee;
import streamjavatest.EmployeeData;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CachedItemImpl {
    @Autowired
    EmployeeData employeeData;

    public static void main(String[] args) {

        // To Remove Above 60 Second
       // usingForLoop(getCachedItem());

        // To using Iterator
        //usingIterator(getCachedItem());

        // To using Lambda Expression
       // usingLambdaExp(getCachedItem());

       // usinglistDisp(getEmloyeeList());
    }


    public static void usingForLoop(List<CachedItem> cachedItemList) {
        for(CachedItem stock : cachedItemList){
            if(isCompareStock(stock)) {
                cachedItemList.remove(stock);
            }
        }
        System.out.println(cachedItemList);
    }

    public static void usingIterator(List<CachedItem> cachedItemList) {
        Iterator<CachedItem> it = cachedItemList.listIterator();
        while (it.hasNext()){
            CachedItem cachedItem = it.next();
            if(isCompareStock(cachedItem)){
                it.remove();
            }

        }
        System.out.println(cachedItemList);
    }

    public static void usingLambdaExp(List<CachedItem> cachedItemList){
            cachedItemList.removeIf(lst->isCompareStock(lst));
        System.out.println(cachedItemList);
    }

    private static boolean isCompareStock(CachedItem cachedItem) {
        return cachedItem.getDuration().compareTo(Duration.ofSeconds(60)) > 0;
    }

    public static List<CachedItem> getCachedItem() {
        List<CachedItem> cachedItemList = new ArrayList<>();
        cachedItemList.add(new CachedItem("APPLE", Duration.ofSeconds(30)));
        cachedItemList.add(new CachedItem("NETFLIX", Duration.ofSeconds(40)));
        cachedItemList.add(new CachedItem("AMAZON", Duration.ofSeconds(50)));
        cachedItemList.add(new CachedItem("GOOGLE", Duration.ofSeconds(70)));
       /* cachedItemList.add(new CachedItem("AAB4", Duration.ofSeconds(60)));
        cachedItemList.add(new CachedItem("AAB5", Duration.ofSeconds(40)));
        cachedItemList.add(new CachedItem("AAB6", Duration.ofSeconds(60)));
        cachedItemList.add(new CachedItem("AAB7", Duration.ofSeconds(70)));
        cachedItemList.add(new CachedItem("AAB8", Duration.ofSeconds(20)));
        cachedItemList.add(new CachedItem("AAB9", Duration.ofSeconds(50)));
        cachedItemList.add(new CachedItem("AABB1", Duration.ofSeconds(20))); */
        return cachedItemList;
    }

    public static List<Employee> getEmloyeeList(){
        List<Employee> empLst = new ArrayList<>();
        empLst.add(new Employee(1001, "Ramesh", "FEV", 80000, 2009, 35, "Active", "Male"));
        empLst.add(new Employee(1010, "Amutha", "DEV", 90000, 2011, 30, "Active", "Female"));
        empLst.add(new Employee(1011, "Laxshana", "Tester", 90000, 2013, 25, "Active", "Female"));
        empLst.add(new Employee(1012, "Kavin", "DEVOPS", 90000, 2014, 29, "Active", "Male"));
        empLst.add(new Employee(1013, "Santhosh", "HR", 40000, 2015, 28, "Inactive", "Male"));
        empLst.add(new Employee(1013, "Dhilip", "HR", 150000, 2014, 28, "Inactive", "Male"));
        empLst.add(new Employee(1013, "Sathis", "HR", 190000, 2014, 23, "Active", "Male"));
        empLst.add(new Employee(1013, "Naveen", "UI", 290000, 2019, 24, "Active", "Male"));
        empLst.add(new Employee(1013, "Boopathi", "UI", 490000, 2020, 26, "Inactive", "Male"));
        empLst.add(new Employee(1013, "Karthi", "BA", 95000, 2020, 27, "Active", "Male"));
        empLst.add(new Employee(1013, "Kows", "BA", 91000, 2018, 28, "Inactive", "Female"));
        empLst.add(new Employee(1013, "Nithya", "DEVOPS", 120000, 2018, 35, "Inactive", "Female"));
        empLst.add(new Employee(1013, "Raji", "DEVOPS", 193000, 2017, 40, "Active", "Female"));
        empLst.add(new Employee(1013, "Kannan", "DEVOPS", 33000, 2016, 42, "Inactive", "Male"));
        empLst.add(new Employee(1013, "Kanagaraj", "HR", 45000, 2014, 48, "Active", "Male"));
        return empLst;
    }
}
