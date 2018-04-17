/*
 * Copyright (c) 17/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.factory.pizza

class SimplePizzaFactory{
    fun createPizza(type:String):Pizza {
        val pizza:Pizza = when(type.toLowerCase()){
            "cheese" -> CheesePizza()
            "clam"  -> ClamPizza()
            "pepperoni"  -> PepperoniPizza()
            "veggie"  -> VeggiePizza()
            else -> {
                println("Oops Not Found")
                VeggiePizza()
            }
        }
        return pizza
    }
}