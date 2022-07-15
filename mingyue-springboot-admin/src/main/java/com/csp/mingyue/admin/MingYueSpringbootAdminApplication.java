package com.csp.mingyue.admin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class MingYueSpringbootAdminApplication {

  public static void main(String[] args) {
    SpringApplication.run(MingYueSpringbootAdminApplication.class, args);
  }
}
