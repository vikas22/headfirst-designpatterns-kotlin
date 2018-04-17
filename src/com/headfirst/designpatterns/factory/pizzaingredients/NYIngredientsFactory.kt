/*
 * Copyright (c) 17/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.factory.pizzaingredients

import com.headfirst.designpatterns.factory.pizzaingredients.cheese.Cheese
import com.headfirst.designpatterns.factory.pizzaingredients.cheese.ReggianoCheese
import com.headfirst.designpatterns.factory.pizzaingredients.clams.Clams
import com.headfirst.designpatterns.factory.pizzaingredients.clams.FreshClams
import com.headfirst.designpatterns.factory.pizzaingredients.dough.Dough
import com.headfirst.designpatterns.factory.pizzaingredients.dough.ThinCrustDough
import com.headfirst.designpatterns.factory.pizzaingredients.sauce.MarinaraSauce
import com.headfirst.designpatterns.factory.pizzaingredients.sauce.Sauce
import com.headfirst.designpatterns.factory.pizzaingredients.veggies.*


class NYIngredientsFactory:IngredientsFactory{
    override fun createDough(): Dough {
        return ThinCrustDough()
    }

    override fun createSauce(): Sauce {
        return  MarinaraSauce()
    }

    override fun createCheese(): Cheese {
        return ReggianoCheese()
    }

    override fun createVeggies(): List<Veggies> {
        return arrayOf(Garlic(), Onions(), Mushroom(), RedPepper()).toList()
    }

    override fun createClam(): Clams {
        return FreshClams()
    }
}