/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.rest;

/**
 *
 * @author MV-06
 */
public interface EmailPort {
    public boolean sendEmail(EmailBody emailBody);
}
