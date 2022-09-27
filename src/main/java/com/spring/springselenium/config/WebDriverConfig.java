package com.spring.springselenium.config;

import com.spring.springselenium.annotation.LazyConfiguration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.*;

@LazyConfiguration
@Profile("!remote")
public class WebDriverConfig {

    @Bean
    @ConditionalOnProperty(name = "browser", havingValue = "chrome")
    public WebDriver chromeDriver(){
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

    @Bean
    @ConditionalOnProperty(name = "browser", havingValue = "firefox")
    public WebDriver firefoxDriver(){
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }


}
