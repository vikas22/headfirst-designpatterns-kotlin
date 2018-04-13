/*
 * Copyright (c) 13/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.observer.custom.subject

import com.headfirst.designpatterns.observer.custom.observers.Observer

interface Subject {
    fun registerObserver(observer: Observer):Unit
    fun removeObserver(observer: Observer):Unit
    fun notifyObserver():Unit
}

