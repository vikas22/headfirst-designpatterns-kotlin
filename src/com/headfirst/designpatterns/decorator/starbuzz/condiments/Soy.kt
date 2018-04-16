/*
 * Copyright (c) 16/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.decorator.starbuzz.condiments

import com.headfirst.designpatterns.decorator.starbuzz.bevarages.Beverage

class Soy: CondimentsDecorator {
    var beverage: Beverage? = null

    override fun cost(): Double {
      return   .15  + beverage!!.cost()
    }

    constructor(beverage: Beverage) {
        this.beverage = beverage
    }

    override fun getDescription(): String {
        return beverage!!.getDescription() + ", Soy"
    }
}