package com.spring.springselenium.config;

import com.github.javafaker.Faker;
import com.spring.springselenium.annotation.LazyConfiguration;
import org.springframework.context.annotation.Bean;


@LazyConfiguration
public class FakerConfig {

    @Bean
    public Faker getFaker(){
        return new Faker();
    }
}
