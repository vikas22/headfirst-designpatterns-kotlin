/*
 * Copyright (c) 16/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.decorator.starubuzzWithSizes.bevarages

class Expresso: Beverage() {

    override var beverageDescription: String = "Expresso"

    override fun cost(): Double {
        return 1.99
    }

}