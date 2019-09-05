package com.aruna.strategy;

import java.math.BigDecimal;

public class SubstractionStrategy implements IStrategy {
    
    public BigDecimal execute(BigDecimal number1, BigDecimal number2) {
        return number1.subtract(number2);
    }
}
