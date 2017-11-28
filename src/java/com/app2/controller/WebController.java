/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app2.controller;

import com.app2.dto.UserDTO;
import com.app2.service.UserService;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
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
    
    @Autowired
    UserService userService;
    
   @RequestMapping(value = "/", method = RequestMethod.GET)
   public String index() {
      return "redirect:/resources/index.html";
   }
   
   @RequestMapping(value = "/SecondStep", method = RequestMethod.POST)
   public @ResponseBody boolean redirect(@RequestParam(value = "userName") String userName) {
       UserDTO userDTO = new UserDTO();
       userDTO.setUserName(userName);
       boolean add=false;
        try {
           UserDTO userByUserName = userService.getUserByUserName(userName);
            if (userByUserName.getId()==null) {
                add = userService.add(userDTO);
            }
        } catch (Exception ex) {
            Logger.getLogger(WebController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return add;
   }
   
   @RequestMapping(value = "/SecondStep", method = RequestMethod.GET)
   public String redirect() {
      return "redirect:/resources/StepTwo.html";
   }
   @RequestMapping(value = "/3rdStep", method = RequestMethod.GET)
   public String redirect2() {
      return "redirect:/resources/StepThree.html";
   }
   
   @RequestMapping(value = "/3rdStep", method = RequestMethod.POST)
   public @ResponseBody boolean updateUserProfile(@RequestParam(value = "age")String age,
           @RequestParam(value = "phone") String phone,
           @RequestParam(value = "user")String userName) {
           boolean update =false;
        try {
            UserDTO userByUserName = userService.getUserByUserName(userName);
            userByUserName.setAge(age);
            userByUserName.setPhone(phone);
            update = userService.update(userByUserName);
        } catch (Exception ex) {
            Logger.getLogger(WebController.class.getName()).log(Level.SEVERE, null, ex);
        }
      return update;
   }
    
   @RequestMapping(value = "/getAllData", method = RequestMethod.GET)
   public @ResponseBody List<UserDTO> getAllUsers (){
         List<UserDTO> all=null;
        try {
            all = userService.getAll();
        } catch (Exception ex) {
            Logger.getLogger(WebController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return all;
   }

}
