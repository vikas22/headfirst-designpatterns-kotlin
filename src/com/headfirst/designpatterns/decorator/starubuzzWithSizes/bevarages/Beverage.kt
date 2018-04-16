/*
 * Copyright (c) 16/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.decorator.starubuzzWithSizes.bevarages


abstract class Beverage {

    enum class Size{
        TALL, GRANDE, VENTI
    }

    private var size:Size = Size.GRANDE

    fun setSize(size:Size):Unit {
        this.size = size
    }

    fun getSize():Size {
        return this.size
    }

    open var beverageDescription:String = "UNKNOWN BEVERAGE"

    abstract fun cost():Double

    open fun getDescription():String {
        return beverageDescription
    }
}