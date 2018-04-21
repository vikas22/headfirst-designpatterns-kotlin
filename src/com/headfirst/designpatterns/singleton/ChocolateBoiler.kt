/*
 * Copyright (c) 21/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.singleton

class ChocolateBoiler {
    private  var empty:Boolean
    private var boiled:Boolean

    //helps us to create one object of current class
    companion object {
     val instance:ChocolateBoiler by lazy { ChocolateBoiler() }
    }

    //making constructor private doesn't allow to create an instance.
    private constructor(){
        println("ChocolateBoiler initialized")
        empty = true
        boiled = false
    }

     fun fill() {
        if (isEmpty()){
            empty = false
            boiled = false
        }

    }

    fun drain(){
        if(!isEmpty() && isBoiled()){
            empty = true
        }
    }

    fun boil(){
        if(!isBoiled() && !isEmpty()){
            boiled = true
        }
    }

    fun isEmpty(): Boolean {
       return empty
    }

    fun isBoiled():Boolean {
        return boiled
    }
}

