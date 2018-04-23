/*
 * Copyright (c) 22/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.command.cmds

class NoCommand:Command{
    override fun execute() {
        println("No Command")
    }

    override fun undo() {
        println("No undo command")
    }
}