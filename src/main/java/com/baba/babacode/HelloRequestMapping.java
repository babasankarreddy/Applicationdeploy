package com.baba.babacode;

import org.springframework.aot.hint.annotation.RegisterReflection;

@RegisterReflection
public class HelloRequestMapping {
    
    public String hello(){
        return "hello World";
    }
}