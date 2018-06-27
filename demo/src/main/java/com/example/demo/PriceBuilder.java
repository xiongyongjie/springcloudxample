package com.example.demo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Description:
 * @Author: 熊永杰
 * @CreateDate: 2018/6/19 20:15
 */
@Data
public class PriceBuilder {
    /**
     * 价格信息
      */
  private BigDecimal total = new BigDecimal(0);
  public PriceBuilder add(BigDecimal bigDecimal){
      total = total.add(bigDecimal);
      return this;
  }
}
