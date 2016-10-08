package com.bakigoal.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ilmir on 08.10.16.
 */
@Controller
@RequestMapping("/login")
public class LoginController {

  @GetMapping
  public String login() {
    return "login";
  }
}
