package com.dw.springcrudjpa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

  @GetMapping("/index")
  public String callMainPage() {
    return "index";
  }

  @GetMapping("/dept")
  public String callDeptPage() {
    return "dept";
  }

}
