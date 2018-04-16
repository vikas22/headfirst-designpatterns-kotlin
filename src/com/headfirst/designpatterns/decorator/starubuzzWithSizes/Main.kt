/*
 * Copyright (c) 16/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.decorator.starubuzzWithSizes

import com.headfirst.designpatterns.decorator.starubuzzWithSizes.bevarages.*
import com.headfirst.designpatterns.decorator.starubuzzWithSizes.condiments.*


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

    beverage3 = HouseBlend()
    beverage3.setSize(Beverage.Size.VENTI)
    beverage3 = Soy(beverage3)
    beverage3 = Mocha(beverage3)
    beverage3 = Whip(beverage3)

    println(beverage3.getDescription() + " $" + beverage3.cost())

}