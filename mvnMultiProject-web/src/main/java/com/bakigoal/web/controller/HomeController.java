package com.bakigoal.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ilmir on 08.10.16.
 */
@Controller
public class HomeController {

  @RequestMapping(value = {"/home", "/"})
  public String home(Model model) {
    model.addAttribute("message", "Test message: 'This is welcome page! Good to see you!'");
    return "home";
  }
}
