/*
 * Copyright (c) 16/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.decorator.starbuzz.bevarages

class Decaf: Beverage() {
    override var beverageDescription: String = "Decaf"

    override fun cost(): Double {
        return 1.05
    }
}