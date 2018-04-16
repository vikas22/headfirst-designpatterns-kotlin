/*
 * Copyright (c) 16/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.decorator.starbuzz.bevarages


abstract class Beverage {
    open var beverageDescription:String = "UNKNOWN BEVERAGE"

    abstract fun cost():Double

    open fun getDescription():String {
        return beverageDescription
    }
}