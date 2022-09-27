package com.spring.springselenium.condition;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("accord")
//@ConditionalOnExpression("${car.speed} > 70")
//@Primary
public class Accord implements Car{

    @Override
    public void run() {
        System.out.println("I am accord. Speed is 80 mph");
    }
}
