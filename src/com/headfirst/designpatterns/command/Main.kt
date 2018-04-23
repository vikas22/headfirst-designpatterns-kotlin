/*
 * Copyright (c) 22/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.command

import com.headfirst.designpatterns.command.cmds.*
import com.headfirst.designpatterns.command.devices.CeilingFan
import com.headfirst.designpatterns.command.devices.GarageDoor
import com.headfirst.designpatterns.command.devices.Light
import com.headfirst.designpatterns.command.devices.Stereo

fun main(args:Array<String>){
    println("Command pattern")
    val remoteControl = RemoteControl()
    val kitchenLight = Light("Kitchen")
    val livingRoomLight = Light("Living Room")
    val ceilingFan = CeilingFan("Living Room")
    val garageDoor = GarageDoor()
    val stereo = Stereo("Living Room")

    val livingRoomLightOnCommand = LightOnCommand(livingRoomLight)
    val livingRoomLightOffCommand = LightOffCommand(livingRoomLight)
    val kitchenLightOnCommand = LightOnCommand(kitchenLight)
    val kitchenLightOffCommand = LightOffCommand(kitchenLight)
    val ceilingFanOnCommand = CeilingFanOnCommand(ceilingFan)
    val ceilingFanOffCommand = CeilingFanOffCommand(ceilingFan)
    val garageOnCommand = GarageOnCommand(garageDoor)
    val garageOffCommand = GarageOffCommand(garageDoor)
    val stereoOnCommand = StereoOnWithCDCommand(stereo)
    val stereoOffCommand = StereoOffCommand(stereo)

    remoteControl.setCommand(0, livingRoomLightOnCommand, livingRoomLightOffCommand)
    remoteControl.setCommand(1, kitchenLightOnCommand, kitchenLightOffCommand)
    remoteControl.setCommand(2, ceilingFanOnCommand, ceilingFanOffCommand)
    remoteControl.setCommand(3, garageOnCommand, garageOffCommand)
    remoteControl.setCommand(4, stereoOnCommand, stereoOffCommand)


    println(remoteControl)

    remoteControl.buttonOnWasPushed(0)
    remoteControl.buttonUndoWasPushed()
    remoteControl.buttonOnWasPushed(1)
    remoteControl.buttonOnWasPushed(2)
    remoteControl.buttonOnWasPushed(3)
    remoteControl.buttonOnWasPushed(4)


    remoteControl.buttonOffWasPushed(0)
    remoteControl.buttonOffWasPushed(1)
    remoteControl.buttonOffWasPushed(2)
    remoteControl.buttonOffWasPushed(3)
    remoteControl.buttonOffWasPushed(4)

    remoteControl.buttonOffWasPushed(6)


}
