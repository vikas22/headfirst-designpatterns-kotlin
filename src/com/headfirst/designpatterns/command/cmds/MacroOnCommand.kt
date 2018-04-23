/*
 * Copyright (c) 22/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.command.cmds


class MacroOnCommand:Command {

    val commands:List<Command>

    constructor(commands:List<Command>) {
        this.commands = commands
    }
    override fun execute() {
        for(command in commands){
            command.execute()
        }
    }

    override fun undo() {
        for(command in commands){
            command.undo()
        }
    }
}