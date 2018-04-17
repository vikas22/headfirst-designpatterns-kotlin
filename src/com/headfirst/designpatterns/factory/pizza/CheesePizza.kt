/*
 * Copyright (c) 17/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.factory.pizza


class CheesePizza:Pizza{
    constructor(){
        name= "Cheese Pizza"
        dough = "Regular Crust"
        sauce = "Marinara Pizza Sauce"
        toppings.add("Fresh Mozzarella")
        toppings.add("Parmesan")
    }
}