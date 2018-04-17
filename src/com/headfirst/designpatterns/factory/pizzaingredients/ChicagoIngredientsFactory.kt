/*
 * Copyright (c) 17/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.factory.pizzaingredients

import com.headfirst.designpatterns.factory.pizzaingredients.cheese.Cheese
import com.headfirst.designpatterns.factory.pizzaingredients.cheese.MozzarellaCheese
import com.headfirst.designpatterns.factory.pizzaingredients.cheese.ReggianoCheese
import com.headfirst.designpatterns.factory.pizzaingredients.clams.Clams
import com.headfirst.designpatterns.factory.pizzaingredients.clams.FreshClams
import com.headfirst.designpatterns.factory.pizzaingredients.clams.FrozenClams
import com.headfirst.designpatterns.factory.pizzaingredients.dough.Dough
import com.headfirst.designpatterns.factory.pizzaingredients.dough.ThickCrustDough
import com.headfirst.designpatterns.factory.pizzaingredients.dough.ThinCrustDough
import com.headfirst.designpatterns.factory.pizzaingredients.sauce.MarinaraSauce
import com.headfirst.designpatterns.factory.pizzaingredients.sauce.PlumTomatoSauce
import com.headfirst.designpatterns.factory.pizzaingredients.sauce.Sauce
import com.headfirst.designpatterns.factory.pizzaingredients.veggies.*


class ChicagoIngredientsFactory:IngredientsFactory{
    override fun createDough(): Dough {
        return ThickCrustDough()
    }

    override fun createSauce(): Sauce {
        return  PlumTomatoSauce()
    }

    override fun createCheese(): Cheese {
        return MozzarellaCheese()
    }

    override fun createVeggies(): List<Veggies> {
        return arrayOf(BlackOlives(), Spinach(), Eggplant()).toList()
    }

    override fun createClam(): Clams {
        return FrozenClams()
    }
}