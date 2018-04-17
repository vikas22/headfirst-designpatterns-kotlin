/*
 * Copyright (c) 17/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.factory.pizzaingredients.pizza

import com.headfirst.designpatterns.factory.pizzaingredients.IngredientsFactory

class PepperoniPizza:Pizza{
    val ingredientsFactory:IngredientsFactory?

    constructor(ingredientsFactory: IngredientsFactory){
        this.ingredientsFactory = ingredientsFactory
    }

    override fun prepare() {
        println("Preparing " + name)
        dough = ingredientsFactory!!.createDough()
        sauce = ingredientsFactory.createSauce()
        cheese = ingredientsFactory.createCheese()
        veggies= ingredientsFactory.createVeggies()
        pepperoni= ingredientsFactory.createPepperoni()
    }
}