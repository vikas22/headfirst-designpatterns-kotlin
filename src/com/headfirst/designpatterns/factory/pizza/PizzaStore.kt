/*
 * Copyright (c) 17/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.factory.pizza

class PizzaStore(val simplePizzaFactory: SimplePizzaFactory) {
    fun orderPizza(type:String): Pizza {
        val pizza:Pizza?
        pizza = simplePizzaFactory.createPizza(type)
        pizza.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()
        return pizza
    }
}