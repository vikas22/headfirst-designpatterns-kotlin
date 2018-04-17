/*
 * Copyright (c) 17/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.factory.pizzaingredients.cheese

import com.headfirst.designpatterns.factory.pizzaingredients.cheese.Cheese

class MozzarellaCheese: Cheese {
    override fun toString(): String {
        return  "Mozzarella cheese"
    }
}