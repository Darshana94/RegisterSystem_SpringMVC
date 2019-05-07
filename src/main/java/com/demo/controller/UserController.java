/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Darshana
 */
@Controller
public class UserController {
    
    @RequestMapping(value="/")
    public String showIndex(){
        return "index";
    }
    
}
