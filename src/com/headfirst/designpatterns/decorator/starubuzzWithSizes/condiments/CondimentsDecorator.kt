/*
 * Copyright (c) 16/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.decorator.starubuzzWithSizes.condiments

import com.headfirst.designpatterns.decorator.starubuzzWithSizes.bevarages.Beverage

abstract class CondimentsDecorator: Beverage() {
    abstract override fun getDescription():String
}