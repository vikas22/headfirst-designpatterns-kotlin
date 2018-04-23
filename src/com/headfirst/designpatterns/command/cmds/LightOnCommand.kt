/*
 * Copyright (c) 22/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.command.cmds

import com.headfirst.designpatterns.command.devices.Light

class LightOnCommand:Command{
    val light: Light

    constructor(light: Light){
        this.light = light
    }

    override fun execute() {
        light.on()
    }

    override fun undo() {
        light.off()
    }
}