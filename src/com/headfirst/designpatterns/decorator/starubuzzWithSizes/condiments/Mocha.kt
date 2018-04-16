/*
 * Copyright (c) 16/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.decorator.starubuzzWithSizes.condiments

import com.headfirst.designpatterns.decorator.starubuzzWithSizes.bevarages.Beverage

class Mocha: CondimentsDecorator {
    var beverage: Beverage? = null

    override fun cost(): Double {
      return   .20 + beverage!!.cost()
    }

    constructor(beverage: Beverage) {
        this.beverage = beverage
    }

    override fun getDescription(): String {
        return beverage!!.getDescription() + ", Mocha"
    }
}