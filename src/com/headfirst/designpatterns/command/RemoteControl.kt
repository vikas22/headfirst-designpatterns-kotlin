/*
 * Copyright (c) 22/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.command

import com.headfirst.designpatterns.command.cmds.Command
import com.headfirst.designpatterns.command.cmds.NoCommand

class RemoteControl{
    var onCommands:Array<Command>
    var offCommands:Array<Command>
    var undoCommand:Command
    val slotSize = 7
    constructor(){
        val command = NoCommand()
        onCommands = Array(slotSize , {i -> command  })
        offCommands = Array(slotSize ,{i -> command  })
        undoCommand = command
    }

    fun setCommand(slot:Int, onCommand:Command, offCommand: Command){
        onCommands[slot] = onCommand
        offCommands[slot] = offCommand
    }

    fun buttonOnWasPushed(slot:Int){
        onCommands[slot].execute()
        undoCommand = onCommands[slot]
    }

    fun buttonOffWasPushed(slot:Int){
        offCommands[slot].execute()
        undoCommand = offCommands[slot]
    }

    fun buttonUndoWasPushed() {
        println("Undo was pushed")
        undoCommand.undo()
        println("-------------")

    }



    override fun toString():String{
        val stringBuffer = StringBuffer()
        for(i in 0..slotSize-1){
            val onCommandStr = onCommands[i].javaClass.kotlin.toString()
            val offCommandStr = offCommands[i].javaClass.kotlin.toString()
            stringBuffer.append("[slot $i] " + onCommandStr.substring((onCommandStr.lastIndexOf('.') + 1),onCommandStr.length )+ "  " + offCommandStr.substring((offCommandStr.lastIndexOf('.') + 1),offCommandStr.length )  + "\n")
        }
        val undoCommanStr = undoCommand.javaClass.kotlin.toString()
        stringBuffer.append("Undo command " + undoCommanStr.substring((undoCommanStr.lastIndexOf('.') + 1),undoCommanStr.length ) + "\n")
        return stringBuffer.toString()
    }


}




