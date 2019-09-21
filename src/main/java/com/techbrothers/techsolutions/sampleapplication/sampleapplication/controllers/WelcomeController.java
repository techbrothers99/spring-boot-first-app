/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techbrothers.techsolutions.sampleapplication.sampleapplication.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author chiru
 */
@RestController
public class WelcomeController {
    
    @GetMapping("/")
    public String welcome(){
        return "Welcome to TechBrothers-TechSolutions";
    }
    
}
