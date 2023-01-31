package com.spring.springselenium.bdd;

import com.spring.springselenium.kelvin.annotation.LazyAutowired;
import com.spring.springselenium.page.bing.BingPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.Assert;

@CucumberContextConfiguration
@SpringBootTest
public class BingSteps {

    @LazyAutowired
    private BingPage bingPage;

    @Given("I am on the bing site")
    public void launchSite() {
        this.bingPage.goTo();
    }

    @When("I enter {string} as a keyword")
    public void enterKeyword(String keyword) {
        this.bingPage.getSearchComponent().search(keyword);
    }

    @Then("I should see search results page")
    public void clickSearch() {
        Assert.assertTrue(this.bingPage.getSearchResult().isAt());
    }

    @Then("I should see at least {int} results")
    public void verifyResults(int count) {
        Assert.assertTrue(this.bingPage.getSearchResult().getCount() >= count);
    }

}
