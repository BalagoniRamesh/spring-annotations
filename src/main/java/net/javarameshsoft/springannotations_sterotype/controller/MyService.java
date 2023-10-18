package net.javarameshsoft.springannotations_sterotype.controller;

import org.springframework.stereotype.Service;

@Service
public class MyService {
    //Real time project we create a Service class with in a Service class we keep all the business logic

    public String hello(){
        return  "Hello Service";
    }
}
