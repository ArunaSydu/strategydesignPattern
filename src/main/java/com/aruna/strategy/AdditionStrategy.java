package com.aruna.strategy;

import java.math.BigDecimal;

public class AdditionStrategy implements IStrategy {
    
    public BigDecimal execute(BigDecimal number1, BigDecimal number2) {
       return number1.add(number1);
    }
}
