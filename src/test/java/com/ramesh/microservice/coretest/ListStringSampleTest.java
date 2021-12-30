package com.ramesh.microservice.coretest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

import static org.hamcrest.MatcherAssert.assertThat;


public class ListStringSampleTest {

    List<Integer> lstInt = new ArrayList<>();
    @BeforeEach
    public void empList() {
        lstInt = Arrays.asList(2,22,33,44,222,334,455,344,224,553,236);
    }

      // Junit for
      @Test
      public void given_when_then(){

          // Given - Setup

          // When - Action
          List<Integer> lstint = lstInt.stream().map(e -> String.valueOf(e))
                  .filter(estr -> estr.startsWith("2"))
                  .map(Integer::valueOf).collect(Collectors.toList());
          System.out.println(lstint);

          Optional<Integer> lstint2 = lstInt.stream().map(e -> String.valueOf(e))
                  .filter(estr -> estr.startsWith("2"))
                  .map(Integer::valueOf)
                  .reduce((a,b)->a+b);
          System.out.println("Before check :"+lstint2.get());
          Optional<Integer> intv =lstint.stream().reduce((a,b)->a+b);
          System.out.println("The Total value is :"+intv.get());
           // Then - Verify or Output
      }
}
