/*
 * Copyright (c) 12/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.strategy.duck

import com.headfirst.designpatterns.strategy.fly.FlyBehaviour
import com.headfirst.designpatterns.strategy.quack.QuackBehaviour

interface Duck {

    var quackBehaviour: QuackBehaviour?
    var flyBehaviour: FlyBehaviour?


    fun swim():Unit  {
        println("All ducks can swim")
    }

    fun display()
    fun perfromQuack()
    fun perfromFly()

    fun setFly(flyBehaviour: FlyBehaviour)
    fun setQuack(quackBehaviour: QuackBehaviour)

}