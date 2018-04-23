/*
 * Copyright (c) 22/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.command

import com.headfirst.designpatterns.command.cmds.*
import com.headfirst.designpatterns.command.devices.*

fun main(args:Array<String>){
    println("Command pattern")

    val remoteControl = RemoteControl()
    val livingRoomLight = Light("Living Room")
    val ceilingFan = CeilingFan("Living Room")
    val tv = TV("Living Room")
    val stereo = Stereo("Living Room")
    val hotTub = HotTub()


    val livingRoomLightOnCommand = LightOnCommand(livingRoomLight)
    val livingRoomLightOffCommand = LightOffCommand(livingRoomLight)
    val ceilingFanOnCommand = CeilingFanOnCommand(ceilingFan)
    val ceilingFanOffCommand = CeilingFanOffCommand(ceilingFan)
    val stereoOnCommand = StereoOnWithCDCommand(stereo)
    val stereoOffCommand = StereoOffCommand(stereo)
    val tVonDVDCommand = TVonDVDCommand(tv)
    val tVoffCommand = TVoffCommand(tv)
    val hotTubOnCommand = HotTubOnCommand(hotTub)
    val hotTubOffCommand = HotTubOffCommand(hotTub)


    val onCommands = listOf<Command>(livingRoomLightOnCommand, ceilingFanOnCommand, stereoOnCommand, tVonDVDCommand, hotTubOnCommand)
    val offCommands = listOf<Command>(livingRoomLightOffCommand, ceilingFanOffCommand, stereoOffCommand, tVoffCommand, hotTubOffCommand)

    remoteControl.setCommand(0, MacroOnCommand(onCommands), MacroOffCommand(offCommands))
    println(remoteControl)
    remoteControl.buttonOnWasPushed(0)
    remoteControl.buttonOffWasPushed(0)

}