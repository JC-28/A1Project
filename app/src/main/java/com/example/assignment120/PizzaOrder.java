package com.example.assignment120;

import java.io.Serializable;

public class PizzaOrder implements Serializable {
    String pizza_name;
    String pizza_size;

    public void Order(String Pname, String Psize){
         this.pizza_name = Pname;
         this.pizza_size = Psize;
    }

    public String getName() {
        return pizza_name;
    }

}
