package com.csp.mingyue.event.events;

import java.time.Clock;
import lombok.Data;
import org.springframework.context.ApplicationEvent;

/**
 * @author Strive
 * @date 2022/4/22 18:00
 * @description
 */
@Data
public class OrderProductEvent extends ApplicationEvent {

  /** 该类型事件携带的信息 */
  private String orderId;

  public OrderProductEvent(Object source, Clock clock, String orderId) {
    super(source, clock);
    this.orderId = orderId;
  }
}
