/*
 * Copyright (c) 16/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.decorator.io

import java.io.BufferedInputStream
import java.io.FileInputStream

fun main(args:Array<String>) {
    try {
        val inputStream = LowerCaseInputStream(BufferedInputStream(FileInputStream("input.txt")))
        var c= 0
        while (c >= 0) {
            c = inputStream.read()
            print(c.toChar().toString())
        }
    }
    catch (ex: Exception){
        ex.printStackTrace()
    }
}