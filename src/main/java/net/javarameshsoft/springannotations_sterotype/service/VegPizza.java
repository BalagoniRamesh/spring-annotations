package net.javarameshsoft.springannotations_sterotype.service;

import net.javarameshsoft.springannotations_sterotype.service.Pizza;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component
//@Primary
public class VegPizza implements Pizza {
    @Override
    public String getPizza(){
        return "veg Pizza!";
    }

}
