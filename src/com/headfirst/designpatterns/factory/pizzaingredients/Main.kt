/*
 * Copyright (c) 17/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.factory.pizzaingredients

fun main(args:Array<String>){
    println("Factory pattern")
    val nyStore = NYPizzaStore()
    val chicagoStore = ChicagoPizzaStore()

    var pizza = nyStore.orderPizza("cheese")
    println("Ethan ordered a $pizza\n")

    pizza = chicagoStore.orderPizza("cheese")
    println("Joel ordered a $pizza\n")

    pizza = nyStore.orderPizza("clam")
    println("Ethan ordered a $pizza\n")

    pizza = chicagoStore.orderPizza("clam")
    println("Joel ordered a $pizza\n")

    pizza = nyStore.orderPizza("pepperoni")
    println("Ethan ordered a $pizza\n")

    pizza = chicagoStore.orderPizza("pepperoni")
    println("Joel ordered a $pizza\n")

    pizza = nyStore.orderPizza("veggie")
    println("Ethan ordered a $pizza\n")

    pizza = chicagoStore.orderPizza("veggie")
    println("Joel ordered a $pizza\n")
}