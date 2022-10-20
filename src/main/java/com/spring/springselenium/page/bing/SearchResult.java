package com.spring.springselenium.page.bing;

import com.spring.springselenium.kelvin.annotation.PageFragment;
import com.spring.springselenium.page.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import java.util.List;

@PageFragment
public class SearchResult extends Base {

    @FindBy(className = "b_algo")
    private List<WebElement> results;

    public int getCount(){
        return this.results.size();
    }

    @Override
    public boolean isAt() {
        return this.wait.until((d)-> !this.results.isEmpty());
    }
}
