/*
 * Copyright (c) 17/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.factory.pizzaingredients.pizza

import com.headfirst.designpatterns.factory.pizzaingredients.cheese.Cheese
import com.headfirst.designpatterns.factory.pizzaingredients.clams.Clams
import com.headfirst.designpatterns.factory.pizzaingredients.dough.Dough
import com.headfirst.designpatterns.factory.pizzaingredients.pepperoni.Pepperoni
import com.headfirst.designpatterns.factory.pizzaingredients.sauce.Sauce
import com.headfirst.designpatterns.factory.pizzaingredients.veggies.Veggies


abstract class Pizza{
    var name: String = ""
    var dough: Dough? = null
    var sauce: Sauce? = null
    var veggies: List<Veggies>? = null
    var cheese: Cheese? = null
    var pepperoni: Pepperoni? = null
    var clam: Clams? = null

    internal abstract fun prepare()

    fun bake() {
        println("Bake for 25 minutes at 350")
    }

    fun cut() {
        println("Cutting the pizza into diagonal slices")
    }

    fun box() {
        println("Place pizza in official PizzaStore box")
    }

    fun setPizzaName(name: String) {
        this.name = name
    }

    fun getPizzaName(): String {
        return name
    }

    override fun toString(): String {
        val result = StringBuffer()
        result.append("---- $name ----\n")
        if (dough != null) {
            result.append(dough)
            result.append("\n")
        }
        if (sauce != null) {
            result.append(sauce)
            result.append("\n")
        }
        if (cheese != null) {
            result.append(cheese)
            result.append("\n")
        }
        if (veggies != null) {
            for (i in veggies!!.indices) {
                result.append(veggies!![i])
                if (i < veggies!!.size - 1) {
                    result.append(", ")
                }
            }
            result.append("\n")
        }
        if (clam != null) {
            result.append(clam)
            result.append("\n")
        }
        if (pepperoni != null) {
            result.append(pepperoni)
            result.append("\n")
        }
        return result.toString()
    }


}