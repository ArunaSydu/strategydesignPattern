package com.aruna.strategy;

import java.math.BigDecimal;

public class Context {

    private IStrategy strategy;

    BigDecimal executeStrategy(BigDecimal a, BigDecimal b) {
        return strategy.execute(a, b);
    }
    
    public IStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    
    
}
