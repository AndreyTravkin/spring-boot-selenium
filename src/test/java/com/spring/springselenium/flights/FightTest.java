package com.spring.springselenium.flights;

import com.spring.springselenium.SpringBaseTestNGTest;
import com.spring.springselenium.page.flights.FlightPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FightTest extends SpringBaseTestNGTest {

    @Autowired
    private FlightPage flightPage;

    @Autowired
    private FlightAppDetails appDetails;

    @Test
    public void flightTest() {
       flightPage.goTo(appDetails.getUrl());
        Assert.assertTrue(flightPage.isAt());
        Assert.assertEquals(flightPage.getLabels(), appDetails.getLabels());
    }
}
