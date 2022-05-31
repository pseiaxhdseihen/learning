package com.csp.mingyue.async;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/** @author Strive */
@EnableScheduling
@SpringBootApplication
public class MingYueSpringbootAsyncApplication {

  public static void main(String[] args) {
    SpringApplication.run(MingYueSpringbootAsyncApplication.class, args);
  }
}
