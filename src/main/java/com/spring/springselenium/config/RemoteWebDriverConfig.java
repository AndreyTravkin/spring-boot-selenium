package com.spring.springselenium.config;

import com.spring.springselenium.annotation.LazyConfiguration;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.remote.DesiredCapabilities;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import java.net.URL;

@LazyConfiguration
@Profile("remote")
public class RemoteWebDriverConfig {

    DesiredCapabilities ds = new DesiredCapabilities();

    @Value("${selenium.grid.url}")
    private URL url;

    @Bean
    @ConditionalOnProperty(name = "browser", havingValue = "firefox")
    public WebDriver remoteFirefoxDriver() {
//        return new RemoteWebDriver(this.url, "firefox");
        return new RemoteWebDriver(this.url, DesiredCapabilities.htmlUnit());
    }

    @Bean
    @ConditionalOnMissingBean
    public WebDriver remoteChromeDriver() {
//        return new RemoteWebDriver(this.url,  new DesiredCapabilities().setBrowserName("chrome"));
        return new RemoteWebDriver(this.url, DesiredCapabilities.htmlUnit());
    }


}
