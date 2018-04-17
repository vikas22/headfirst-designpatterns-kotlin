/*
 * Copyright (c) 17/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.factory.pizzast.chicago

import com.headfirst.designpatterns.factory.pizzast.Pizza


class ChicagoStylePepperoniPizza: Pizza {
    constructor(){
        name = "Chicago Style Pepperoni Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Black Olives");
        toppings.add("Spinach");
        toppings.add("Eggplant");
        toppings.add("Sliced Pepperoni");
    }

    override fun cut(): Unit {
        println("Cutting the pizza into square slices")
    }
}