/*
 * Copyright (c) 16/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.decorator.starbuzz.condiments

import com.headfirst.designpatterns.decorator.starbuzz.bevarages.Beverage

abstract class CondimentsDecorator: Beverage() {
    abstract override fun getDescription():String
}