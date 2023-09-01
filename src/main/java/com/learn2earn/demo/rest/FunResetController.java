package com.learn2earn.demo.rest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunResetController {

    // expose "/" that return Hello World!

    @GetMapping("/")
    public String sayHello(){
        return "Hello World!";
    }

    @GetMapping("/bye")
    public String sayBye(){
        return "Bye :)!";
    }
}
