/*
 * Copyright (c) 16/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.decorator.starubuzzWithSizes.bevarages

class DarkRoast: Beverage() {

    override var beverageDescription: String = "DarkRoast"

    override fun cost(): Double {
        return .99
    }

}