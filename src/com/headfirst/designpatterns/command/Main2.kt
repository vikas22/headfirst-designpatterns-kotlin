/*
 * Copyright (c) 22/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.command

import com.headfirst.designpatterns.command.cmds.*
import com.headfirst.designpatterns.command.devices.CeilingFan

fun main(args:Array<String>){

    println("Remote control 2")

    val ceilingFan2 = CeilingFan("Living Room")
    val remoteControl2 = RemoteControl()

    val ceilingFanHighCommand = CeilingFanHighCommand(ceilingFan2)
    val ceilingFanLowCommand = CeilingFanLowCommand(ceilingFan2)
    val ceilingFanMediumCommand= CeilingFanMediumCommand(ceilingFan2)
    val ceilingFan2OnCommand= CeilingFanOnCommand(ceilingFan2)
    val ceilingFan2OffCommand= CeilingFanOffCommand(ceilingFan2)

    remoteControl2.setCommand(0, ceilingFan2OnCommand, ceilingFan2OffCommand)
    remoteControl2.setCommand(1, ceilingFanLowCommand, ceilingFan2OffCommand)
    remoteControl2.setCommand(2, ceilingFanHighCommand, ceilingFan2OffCommand)
    remoteControl2.setCommand(3, ceilingFanMediumCommand, ceilingFan2OffCommand)

    remoteControl2.buttonOnWasPushed(3)
    remoteControl2.buttonOffWasPushed(3)
    println(remoteControl2)
    remoteControl2.buttonUndoWasPushed()


}
