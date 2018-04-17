/*
 * Copyright (c) 17/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.factory.pizza


class VeggiePizza:Pizza{
    constructor(){
        name = "Veggie Pizza";
        dough = "Crust";
        sauce = "Marinara sauce";
        toppings.add("Shredded mozzarella");
        toppings.add("Grated parmesan");
        toppings.add("Diced onion");
        toppings.add("Sliced mushrooms");
        toppings.add("Sliced red pepper");
        toppings.add("Sliced black olives");
    }
}