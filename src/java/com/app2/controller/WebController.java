/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Harindu.sul
 */
@Controller
public class WebController {
    
   @RequestMapping(value = "/", method = RequestMethod.GET)
   public String index() {
      return "redirect:/resources/index.html";
   }
   
   @RequestMapping(value = "/SecondStep", method = RequestMethod.POST)
   public @ResponseBody boolean redirect(@RequestParam(value = "userName") String userName) {
       System.out.println(userName);
      return true;
   }
   @RequestMapping(value = "/SecondStep", method = RequestMethod.GET)
   public String redirect() {
      return "redirect:/resources/StepTwo.html";
   }
   @RequestMapping(value = "/3rdStep", method = RequestMethod.GET)
   public String redirect2() {
      return "redirect:/resources/StepThree.html";
   }

}
