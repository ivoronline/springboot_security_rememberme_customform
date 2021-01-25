package com.example.springboot_security_rememberme_customform.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

  @ResponseBody
  @RequestMapping("/SayHello")
  public String sayHello() {
    return "Hello from Controller";
  }

  @RequestMapping("/MyLogin")
  public String myLogin() {
    return "MyLogin";
  }

}
