/*
 * Copyright (c) 12/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.strategy

import com.headfirst.designpatterns.strategy.duck.*
import com.headfirst.designpatterns.strategy.fly.FlyWithWings
import com.headfirst.designpatterns.strategy.quack.Squeak


fun main(args:Array<String>) {
    println("Strategy design pattern")

    var duck: Duck?

    duck = Mallard()
    duck.display()
    duck.perfromFly()
    duck.perfromQuack()
    duck.swim()

    duck = RedHead()
    duck.display()
    duck.perfromFly()
    duck.perfromQuack()
    duck.swim()

    duck = Rubber()
    duck.display()
    duck.perfromFly()
    duck.perfromQuack()
    duck.swim()

    duck = Decoy()
    duck.display()
    duck.perfromFly()
    duck.perfromQuack()
    duck.swim()

    duck.display()
    duck.setFly(FlyWithWings())
    duck.perfromFly()
    duck.setQuack(Squeak())
    duck.perfromQuack()



}