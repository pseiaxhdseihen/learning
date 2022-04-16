package com.csp.mingyue.base.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/** @author Strive */
@RestController
public class MingYueController {

  @GetMapping("/mingYue")
  public String mingYue() {
    return "Ming Yue";
  }
}
