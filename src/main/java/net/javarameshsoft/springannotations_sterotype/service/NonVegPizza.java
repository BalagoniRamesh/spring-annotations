package net.javarameshsoft.springannotations_sterotype.service;

import net.javarameshsoft.springannotations_sterotype.service.Pizza;

public class NonVegPizza implements Pizza {
    @Override
    public String getPizza() {
        return "Non-veg Pizza";
    }
}
