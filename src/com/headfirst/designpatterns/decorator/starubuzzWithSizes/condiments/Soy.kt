/*
 * Copyright (c) 16/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.decorator.starubuzzWithSizes.condiments

import com.headfirst.designpatterns.decorator.starubuzzWithSizes.bevarages.Beverage

class Soy: CondimentsDecorator {
    var beverage: Beverage? = null

    override fun cost(): Double {
        val cost:Double = when(beverage!!.getSize()){
            Size.TALL  -> .10
            Size.GRANDE-> .15
            Size.VENTI -> .20
        }
      return  cost  + beverage!!.cost()
    }

    constructor(beverage: Beverage) {
        this.beverage = beverage
    }

    override fun getDescription(): String {
        return beverage!!.getDescription() + ", Soy"
    }
}