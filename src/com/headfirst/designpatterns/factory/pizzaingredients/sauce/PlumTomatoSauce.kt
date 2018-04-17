/*
 * Copyright (c) 17/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.factory.pizzaingredients.sauce

import com.headfirst.designpatterns.factory.pizzaingredients.sauce.Sauce

class PlumTomatoSauce: Sauce {
    override fun toString(): String {
        return "Tomato sauce with plum tomatoes"
    }
}