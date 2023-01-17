package com.spring.springselenium.kelvin.aop;

import com.spring.springselenium.kelvin.annotation.Window;
import com.spring.springselenium.kelvin.service.WindowSwitchService;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class WindowAspect {

    @Autowired
    private WindowSwitchService switchService;

    @Before("@target(window) && within(com.spring.springselenium..*)")
    public void before(Window window){
        this.switchService.switchByTitle(window.value());
    }

    @After("@target(window) && within(com.spring.springselenium..*)")
    public void after(Window window){
        this.switchService.switchByIndex(0);
    }

}