package com.spring.springselenium.scope;

import com.spring.springselenium.SpringBaseTestNGTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

public class JuniorSeniorTest extends SpringBaseTestNGTest {

    @Autowired
    private JuniorEngineer juniorEngineer;

    @Autowired
    private SeniorEngineer seniorEngineer;

    @Test
    public void scopeTest(){
        juniorEngineer.setAmount(100);
        System.out.println("junior " + juniorEngineer.getSalary().getAmount());
        seniorEngineer.setAmount(200);
        System.out.println("senior " + seniorEngineer.getSalary().getAmount());
        System.out.println("junior " + juniorEngineer.getSalary().getAmount());
    }
}
