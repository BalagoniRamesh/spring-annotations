package net.javarameshsoft.springannotations_sterotype.repository;

import org.springframework.stereotype.Repository;

@Repository
public class MyRepository {
    //Real time project we create a Repository class with in a Repository class we keep all the database related logic
    public String hello(){
        return "Hello Repository";
    }
}
