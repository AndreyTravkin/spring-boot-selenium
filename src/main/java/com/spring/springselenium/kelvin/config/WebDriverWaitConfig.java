package com.spring.springselenium.kelvin.config;

import com.spring.springselenium.kelvin.annotation.LazyConfiguration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;



@LazyConfiguration
public class WebDriverWaitConfig {

    @Value("${default.timeout:30}")
    private int timeout;

    @Bean
    WebDriverWait webDriverWait(WebDriver driver){
        return new WebDriverWait(driver, this.timeout);
    }
}
