/*
 * Copyright (c) 16/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.decorator.starbuzz

import com.headfirst.designpatterns.decorator.starbuzz.bevarages.Beverage
import com.headfirst.designpatterns.decorator.starbuzz.bevarages.DarkRoast
import com.headfirst.designpatterns.decorator.starbuzz.bevarages.Expresso
import com.headfirst.designpatterns.decorator.starbuzz.bevarages.HouseBlend
import com.headfirst.designpatterns.decorator.starbuzz.condiments.Mocha
import com.headfirst.designpatterns.decorator.starbuzz.condiments.Soy
import com.headfirst.designpatterns.decorator.starbuzz.condiments.Whip

fun main(array: Array<String>) {
    println("Decorator pattern")

    val beverage = Expresso()
    println(beverage.getDescription() + " $" + beverage.cost())

    var beverage2: Beverage = DarkRoast()

    beverage2 = Mocha(beverage2)
    beverage2 = Mocha(beverage2)
    beverage2 = Whip(beverage2)

    println(beverage2.getDescription() + " $" + beverage2.cost())

    var beverage3: Beverage = HouseBlend()
    beverage3 = Soy(beverage3)
    beverage3 = Mocha(beverage3)
    beverage3 = Whip(beverage3)

    println(beverage3.getDescription() + " $" + beverage3.cost())
}