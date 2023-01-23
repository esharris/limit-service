/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.in28minutes.microservices.limitsservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.microservices.limitsservice.bean.Limits;
/**
 *
 * @author earlharris
 */
@RestController
public class LimitsController {
    
    @GetMapping("/limits")
    public Limits retrieveLimits() {
        return new Limits(1, 1000);
    }
}
