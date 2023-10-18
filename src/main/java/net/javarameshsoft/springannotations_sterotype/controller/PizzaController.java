package net.javarameshsoft.springannotations_sterotype.controller;

import net.javarameshsoft.springannotations_sterotype.service.Pizza;
import net.javarameshsoft.springannotations_sterotype.service.VegPizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class PizzaController {

   private Pizza pizza;  //injecting interface to achieve loose-coupling

    public PizzaController( Pizza pizza){
        this.pizza=pizza;
    }


    public String getPizza(){
       return pizza.getPizza();
    }


    public void init(){
        System.out.println("Initialization Logic");

    }
    public void destroy(){
        System.out.println("Destruction Logic");

    }
}
