package com.aruna.strategy;

import java.math.BigDecimal;

public class MultiplicationStrategy implements IStrategy {
    
    public BigDecimal execute(BigDecimal number1, BigDecimal number2) {
        return number1.multiply(number2);
    }
}
