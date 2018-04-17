/*
 * Copyright (c) 17/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.factory.pizza

import java.util.ArrayList



abstract class Pizza {
    var name:String? = null
    var dough: String? = null
    var sauce: String? = null
    var toppings = ArrayList<String>()

    fun prepare(): Unit {
        println("Preparing = $name")
    }

    fun bake(): Unit {
        println("Baking = $name")
    }

    fun cut(): Unit {
        println("Cutting = $name")
    }

    fun box(): Unit {
        println("Boxing = $name")
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