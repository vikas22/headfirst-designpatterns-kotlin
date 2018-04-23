/*
 * Copyright (c) 22/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.command.cmds

import com.headfirst.designpatterns.command.devices.Stereo

class StereoOffCommand:Command{
    val stereo: Stereo

    constructor(stereo: Stereo){
        this.stereo= stereo
    }

    override fun execute() {
        stereo.off()
    }

    override fun undo() {
        stereo.on()
    }
}
