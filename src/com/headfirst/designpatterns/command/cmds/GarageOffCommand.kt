/*
 * Copyright (c) 22/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.command.cmds

import com.headfirst.designpatterns.command.devices.GarageDoor

class GarageOffCommand:Command{
    val garageDoor: GarageDoor

    constructor(garageDoor: GarageDoor){
        this.garageDoor= garageDoor
    }

    override fun execute() {
        garageDoor.down()
    }

    override fun undo() {
        garageDoor.up()
    }
}