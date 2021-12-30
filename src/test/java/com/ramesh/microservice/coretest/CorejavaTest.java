package com.ramesh.microservice.coretest;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class CorejavaTest {

    @BeforeClass
    public static void beforeClass(){
        System.out.println("welcome this is before Class");
    }

    @Before("")
    public void before() {
        System.out.println("____________________");
        System.out.println("\t Before is invoked");
    }
    @After("")
    public void after() {
        System.out.println("\t After is invoked");
        System.out.println("=================");
    }

    @Test
    public void someTest() {
        System.out.println("\t\t someTest is invoked");
    }

    @Test
    public void someTest2() {
        System.out.println("\t\t someTest2 is invoked");
    }


    @AfterClass
    public static void afterClass() {
        System.out.println("***After Class is invoked");
    }

}
