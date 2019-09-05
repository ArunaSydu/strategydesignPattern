package com.aruna.strategy;

import java.math.BigDecimal;

class ExampleApplication {

    static BigDecimal testNumber1 = BigDecimal.TEN;
    static BigDecimal testNumber2 = BigDecimal.ONE;
    
    public static void main(String args[]){
       
        String action = args[0];
        
        Context context = new Context();

        if (action.equals("add")) 
        context.setStrategy(new AdditionStrategy());

        if (action.equals("subtract"))
        context.setStrategy(new SubstractionStrategy());

        if (action.equals("multiply")) 
        context.setStrategy(new MultiplicationStrategy());

        BigDecimal result = context.executeStrategy(testNumber1,testNumber2);

        System.out.println("result is "+result);
    }
}
   