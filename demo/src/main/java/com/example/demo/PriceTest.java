package com.example.demo;

import java.math.BigDecimal;

/**
 * @Description:
 * @Author: 熊永杰
 * @CreateDate: 2018/6/19 20:57
 */
public class PriceTest {

    public static void main(String[] args){
        PriceBuilder priceBuilder = new PriceBuilder();
        priceBuilder.add(new BigDecimal(100))
                .add(new BigDecimal(200))
                .add(new BigDecimal(111));
        System.out.println(priceBuilder.getTotal());
    }
}
