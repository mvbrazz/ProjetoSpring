package com.projeto.projeto.controler;

import org.aspectj.apache.bcel.classfile.Module.Open;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controler {

    @GetMapping(value="/")
    public String teste(){
        return "Olá";        
    }
    
}
