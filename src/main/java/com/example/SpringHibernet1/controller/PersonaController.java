/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.SpringHibernet1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Isma
 */
@Controller
public class PersonaController {
    
    @RequestMapping("/")
    @ResponseBody
    public String index(){
    
        return "Bienvenido...";
    }
    
    
}
