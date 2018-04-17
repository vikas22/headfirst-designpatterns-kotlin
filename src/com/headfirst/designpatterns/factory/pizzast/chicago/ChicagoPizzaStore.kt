/*
 * Copyright (c) 17/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.factory.pizzast.chicago

import com.headfirst.designpatterns.factory.pizzast.Pizza
import com.headfirst.designpatterns.factory.pizzast.PizzaStore

class ChicagoPizzaStore:PizzaStore(){
    override fun createPizza(type: String): Pizza? {
        return when(type.toLowerCase()){
            "cheese" -> ChicagoStyleCheesePizza()
            "clam" -> ChicagoStyleClamPizza()
            "pepperoni" -> ChicagoStylePepperoniPizza()
            "veggie" -> ChicagoStyleVeggiePizza()
            else -> {
                    null
                }
        }
    }
}