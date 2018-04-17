/*
 * Copyright (c) 17/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.factory.pizzast.ny

import com.headfirst.designpatterns.factory.pizzast.Pizza
import com.headfirst.designpatterns.factory.pizzast.PizzaStore

class NYPizzaStore:PizzaStore(){
    override fun createPizza(type: String): Pizza? {
        return when(type.toLowerCase()){
            "cheese" -> NYStyleCheesePizza()
            "clam" -> NYStyleClamPizza()
            "pepperoni" -> NYStylePepperoniPizza()
            "veggie" -> NYStyleVeggiePizza()
            else -> {
                    null
                }
        }
    }
}