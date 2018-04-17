/*
 * Copyright (c) 17/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.factory.pizzaingredients

import com.headfirst.designpatterns.factory.pizzaingredients.pizza.Pizza

abstract class PizzaStore() {
    fun orderPizza(type:String): Pizza {
        val pizza:Pizza?
        pizza = createPizza(type)
        println("Making " + pizza!!.name)
        pizza.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()
        return pizza
    }

    abstract fun createPizza(type: String): Pizza?
}