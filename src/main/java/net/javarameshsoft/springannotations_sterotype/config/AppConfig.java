package net.javarameshsoft.springannotations_sterotype.config;

import net.javarameshsoft.springannotations_sterotype.controller.PizzaController;
import net.javarameshsoft.springannotations_sterotype.service.NonVegPizza;
import net.javarameshsoft.springannotations_sterotype.service.Pizza;
import net.javarameshsoft.springannotations_sterotype.service.VegPizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;


@Configuration
public class AppConfig {
    @Bean
    @Lazy
    public Pizza vegPizza(){
        return new VegPizza();
    }
    @Bean
    public Pizza nonVegPizza(){
        return new NonVegPizza();
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")  //this init method called before creating or initializing this class object(init method basically insert records in database while application startup), so spring container call this destroy method before its gets shutdown [if destroy or delete those records from th database while application shutdown simply use this destroy method attribute we can specify the method  so with in this method we can write to delete the records while application shutdown]
    public PizzaController pizzaController(){
        return new PizzaController(nonVegPizza());  //return object of non veg pizza class explicitly provide the class
    }
}
