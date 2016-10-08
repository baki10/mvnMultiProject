package com.bakigoal.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ilmir on 08.10.16.
 */
@Controller
public class AdminController {

  @RequestMapping(value = "/admin")
  public String home(Model model) {

    return "admin/admin";
  }
}
