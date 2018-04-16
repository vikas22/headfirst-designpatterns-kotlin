/*
 * Copyright (c) 16/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.decorator.starubuzzWithSizes.bevarages

class HouseBlend: Beverage() {

    override var beverageDescription: String = "HouseBlend"

    override fun cost(): Double {
        return .89
    }

}