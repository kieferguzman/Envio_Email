/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author MV-06
 */

@RestController
@RequestMapping(value = "/email")
public class EmailRest {
    
    @Autowired
    private EmailPort emailPort;
    
    @PostMapping(value = "/enviar")
    @ResponseBody
    public boolean SendEmail(@RequestBody EmailBody emailBody)  {
		return emailPort.sendEmail(emailBody);
	}
}
