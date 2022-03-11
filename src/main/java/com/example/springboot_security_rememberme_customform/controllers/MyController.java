package com.example.springboot_security_rememberme_customform.controllers;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

  //=================================================================
  // HELLO
  //=================================================================
  @ResponseBody
  @Secured("ROLE_USER")
  @RequestMapping("Hello")
  String hello() {
    return "Hello from Controller";
  }

  //=================================================================
  // MY LOGIN
  //=================================================================
  @RequestMapping("CustomLoginForm")
  String myLogin() {
    return "CustomLogin";
  }

}
