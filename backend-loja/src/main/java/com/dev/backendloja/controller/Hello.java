package com.dev.backendloja.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")//oque vai ser chamado na url do navegador ou postman
public class Hello {  

@GetMapping("/")//oque vai ser chamado na url do navegador ou postman
public String hello(){ 
    return "Olá muindo Spring " + new Date();
}

    
}
