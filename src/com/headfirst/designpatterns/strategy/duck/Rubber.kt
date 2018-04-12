/*
 * Copyright (c) 12/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.strategy.duck

import com.headfirst.designpatterns.strategy.fly.FlyBehaviour
import com.headfirst.designpatterns.strategy.fly.FlyWithWings
import com.headfirst.designpatterns.strategy.fly.NoFly
import com.headfirst.designpatterns.strategy.quack.QuackBehaviour
import com.headfirst.designpatterns.strategy.quack.Squeak

class Rubber:Duck {
    override var flyBehaviour: FlyBehaviour? = NoFly()

    override var quackBehaviour: QuackBehaviour? = Squeak()

    override fun setFly(flyBehaviour: FlyBehaviour) {
        this.flyBehaviour = flyBehaviour
    }

    override fun setQuack(quackBehaviour: QuackBehaviour) {
        this.quackBehaviour = quackBehaviour
    }


    override fun display() {
        println("Rubber Duck")
    }

    override fun perfromQuack() {
        quackBehaviour!!.quack()
    }

    override fun perfromFly() {
        flyBehaviour!!.fly()
    }

}