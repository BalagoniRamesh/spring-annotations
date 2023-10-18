package net.javarameshsoft.springannotations_sterotype.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    //Real time project we create a controller class with in a controller class write the logic to handle the http request
    public String hello(){
        return  "Hello Controller";
    }
}
