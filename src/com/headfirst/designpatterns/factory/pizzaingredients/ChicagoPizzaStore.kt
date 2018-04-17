/*
 * Copyright (c) 17/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.factory.pizzaingredients

import com.headfirst.designpatterns.factory.pizzaingredients.pizza.*

class ChicagoPizzaStore:PizzaStore(){
    val chicagoIngredientsFactory:IngredientsFactory = ChicagoIngredientsFactory()
    
    override fun createPizza(type: String): Pizza? {
        var pizza:Pizza? = null
        when(type.toLowerCase()){
            "cheese" -> {
                pizza = CheesePizza(chicagoIngredientsFactory)
                pizza.setPizzaName("Chicago Style cheese pizza")
            }
            "clam" -> {
                pizza = ClamPizza(chicagoIngredientsFactory)
                pizza.setPizzaName("Chicago Style clam pizza")
            }
            "pepperoni" -> {
                pizza = PepperoniPizza(chicagoIngredientsFactory)
                pizza.setPizzaName("Chicago Style pepperoni pizza")
            }
            "veggie" -> {
                pizza = VeggiePizza(chicagoIngredientsFactory)
                pizza.setPizzaName("Chicago Style veggie pizza")
            }
            else -> {
                    null
                }
        }
        return pizza
    }
}