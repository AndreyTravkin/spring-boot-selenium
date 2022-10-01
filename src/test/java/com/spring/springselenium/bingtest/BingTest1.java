package com.spring.springselenium.bingtest;

import com.spring.springselenium.SpringBaseTestNGTest;
import com.spring.springselenium.page.bing.BingPage;
import com.spring.springselenium.util.ScreenShotUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class BingTest1 extends SpringBaseTestNGTest {

    @Autowired
    private BingPage bingPage;

    @Lazy
    @Autowired
    private ScreenShotUtil screenShotUtil;

    @Test
    public void bingTest() throws IOException {
        this.bingPage.goTo();
        Assert.assertTrue(this.bingPage.isAt());
        this.bingPage.getSearchComponent().search("selenium ");
        Assert.assertTrue(this.bingPage.getSearchResult().isAt());
        Assert.assertTrue(this.bingPage.getSearchResult().getCount() > 2);
        this.screenShotUtil.takeScreenShot();
        this.bingPage.close();
    }
}
