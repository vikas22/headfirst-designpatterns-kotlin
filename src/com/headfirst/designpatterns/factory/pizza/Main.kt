/*
 * Copyright (c) 17/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.factory.pizza

fun main(args:Array<String>){
    println("Factory pattern")

    val pizzaStore = PizzaStore(SimplePizzaFactory())
    var pizza = pizzaStore.orderPizza("veggie")
    println("You ordered : " + pizza.name)
    println(pizza.toString())
    println("----------------")

    pizza = pizzaStore.orderPizza("pepperoni")
    println("You ordered : " + pizza.name)
    println(pizza.toString())
    println("----------------")

    pizza = pizzaStore.orderPizza("cheese")
    println("You ordered : " + pizza.name)
    println(pizza.toString())
    println("----------------")

    pizza = pizzaStore.orderPizza("clam")
    println("You ordered : " + pizza.name)
    println(pizza.toString())
}