/*
 * Copyright (c) 17/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.factory.pizzaingredients

import com.headfirst.designpatterns.factory.pizzaingredients.cheese.Cheese
import com.headfirst.designpatterns.factory.pizzaingredients.clams.Clams
import com.headfirst.designpatterns.factory.pizzaingredients.dough.Dough
import com.headfirst.designpatterns.factory.pizzaingredients.pepperoni.Pepperoni
import com.headfirst.designpatterns.factory.pizzaingredients.pepperoni.SlicedPepperoni
import com.headfirst.designpatterns.factory.pizzaingredients.sauce.Sauce
import com.headfirst.designpatterns.factory.pizzaingredients.veggies.Veggies

interface IngredientsFactory{
    fun createDough():Dough
    fun createSauce(): Sauce
    fun createCheese(): Cheese
    fun createVeggies():List<Veggies>
    fun createClam():Clams
    fun createPepperoni():Pepperoni{
        return SlicedPepperoni()
    }
}