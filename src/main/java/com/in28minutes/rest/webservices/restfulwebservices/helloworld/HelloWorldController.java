package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello-world")
    public String helloWorld()
    {
        return "Hello World3";
    }

    @GetMapping("/hello-world-bean")
    public HelloWorldBean helloWorldBean()
    {
        return new HelloWorldBean("Hello World3");
    }

    @GetMapping("/hello-world/{msg}")
    public HelloWorldBean helloWorldMsg(@PathVariable String msg)
    {
        return new HelloWorldBean(msg);
    }




}
