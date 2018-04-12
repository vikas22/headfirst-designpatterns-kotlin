/*
 * Copyright (c) 12/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.strategy.duck

import com.headfirst.designpatterns.strategy.fly.FlyBehaviour
import com.headfirst.designpatterns.strategy.fly.FlyWithWings
import com.headfirst.designpatterns.strategy.quack.Quack
import com.headfirst.designpatterns.strategy.quack.QuackBehaviour

class RedHead:Duck {
    override var flyBehaviour: FlyBehaviour? = FlyWithWings()

    override var quackBehaviour: QuackBehaviour? = Quack()

    override fun setFly(flyBehaviour: FlyBehaviour) {
        this.flyBehaviour = flyBehaviour
    }

    override fun setQuack(quackBehaviour: QuackBehaviour) {
        this.quackBehaviour = quackBehaviour
    }



    override fun display() {
        println("RedHead Duck")
    }

    override fun perfromQuack() {
        quackBehaviour!!.quack()
    }

    override fun perfromFly() {
        flyBehaviour!!.fly()
    }

}