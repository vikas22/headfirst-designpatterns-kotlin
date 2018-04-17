/*
 * Copyright (c) 17/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.factory.pizzast

import java.util.*


abstract class Pizza {
    var name:String? = null
    var dough: String? = null
    var sauce: String? = null
    var toppings = ArrayList<String>()

    fun prepare(){
        println("Prepare $name")
        println("Tossing dough...")
        println("Adding sauce...")
        println("Adding toppings: ")
        for (topping in toppings) {
            println("   $topping")
        }
    }

    fun bake() {
        println("Bake for 25 minutes at 350")
    }

    open fun cut(){
        println("Cut the pizza into diagonal slices")
    }

    fun box() {
        println("Place pizza in official PizzaStore box")
    }

    override fun toString():String {
        val buffer = StringBuffer()
        buffer.append("-------$name-------\n" )
        buffer.append("$dough \n" )
        buffer.append("$sauce \n" )
        for(topping in toppings){
            buffer.append("$topping \n")
        }
        return buffer.toString()
    }
}