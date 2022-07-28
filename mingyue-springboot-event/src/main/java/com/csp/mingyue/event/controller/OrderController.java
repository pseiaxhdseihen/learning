package com.csp.mingyue.event.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Strive
 * @date 2022/4/22 17:53
 * @description
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/order")
public class OrderController {

  /**
   * 下单
   *
   * @param orderId 订单ID
   */
  public String buyOrder(String orderId) {
    // 1.查询订单详情

    // 2.检验订单价格 （同步处理）

    // 3.短信通知（异步处理）
    return "购买成功";
  }
}
