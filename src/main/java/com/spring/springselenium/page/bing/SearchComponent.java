package com.spring.springselenium.page.bing;

import com.spring.springselenium.annotation.PageFragment;
import com.spring.springselenium.page.Base;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


@PageFragment
public class SearchComponent extends Base {

    @FindBy(name = "q")
    private WebElement searchBox;

    @FindBy(name = "search")
    private WebElement searchButton;

    public void search(final String keyword){
        this.searchBox.sendKeys(keyword);
        this.searchBox.sendKeys(Keys.ENTER);
    }

    @Override
    public boolean isAt() {
       return this.wait.until((d)-> this.searchBox.isDisplayed());
    }
}
