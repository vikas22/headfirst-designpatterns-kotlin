/*
 * Copyright (c) 17/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.factory.pizzast.chicago

import com.headfirst.designpatterns.factory.pizzast.Pizza


class ChicagoStyleClamPizza: Pizza {
    constructor(){
        name = "Chicago Style Clam Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Frozen Clams from Chesapeake Bay");
    }

    override fun cut(): Unit {
        println("Cutting the pizza into square slices")
    }
}