/*
 * Copyright (c) 17/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.factory.pizzast.chicago

import com.headfirst.designpatterns.factory.pizzast.Pizza


class ChicagoStyleCheesePizza: Pizza {
    constructor(){
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    override fun cut(): Unit {
        println("Cutting the pizza into square slices")
    }
}