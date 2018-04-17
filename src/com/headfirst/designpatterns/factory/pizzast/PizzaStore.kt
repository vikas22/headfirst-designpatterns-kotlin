/*
 * Copyright (c) 17/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.factory.pizzast

abstract class PizzaStore() {
    fun orderPizza(type:String): Pizza {
        val pizza:Pizza?
        pizza = createPizza(type)
        pizza!!.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()
        return pizza
    }

    abstract fun createPizza(type: String): Pizza?
}