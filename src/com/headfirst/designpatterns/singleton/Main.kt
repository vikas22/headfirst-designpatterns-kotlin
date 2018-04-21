/*
 * Copyright (c) 21/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.singleton

fun main(args:Array<String>) {
    println("Singleton pattern")
    println("Chocolate Boiler 1")
    val chocolateBoiler1= ChocolateBoiler.instance
    println("Chocolate Boiler 2")
    val chocolateBoiler3= ChocolateBoiler.instance
    println("Chocolate Boiler 3")
    val chocolateBoiler2= ChocolateBoiler.instance

}