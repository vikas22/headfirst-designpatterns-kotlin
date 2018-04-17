/*
 * Copyright (c) 17/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.factory.pizzaingredients

import com.headfirst.designpatterns.factory.pizzaingredients.pizza.*

class NYPizzaStore:PizzaStore(){
    val nyIngredientsFactory:IngredientsFactory = NYIngredientsFactory()

    override fun createPizza(type: String): Pizza? {
        var pizza:Pizza? = null
        when(type.toLowerCase()){
            "cheese" -> {
                pizza = CheesePizza(nyIngredientsFactory)
                pizza.setPizzaName("NY Style cheese pizza")
            }
            "clam" -> {
                pizza = ClamPizza(nyIngredientsFactory)
                pizza.setPizzaName("NY Style clam pizza")
            }
            "pepperoni" -> {
                pizza = PepperoniPizza(nyIngredientsFactory)
                pizza.setPizzaName("NY Style pepperoni pizza")
            }
            "veggie" -> {
                pizza = VeggiePizza(nyIngredientsFactory)
                pizza.setPizzaName("NY Style veggie pizza")
            }
            else -> {
                    null
                }
        }
        return pizza
    }
}