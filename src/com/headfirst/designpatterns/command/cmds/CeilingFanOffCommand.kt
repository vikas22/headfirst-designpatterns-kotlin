/*
 * Copyright (c) 22/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.command.cmds

import com.headfirst.designpatterns.command.devices.CeilingFan

class CeilingFanOffCommand:Command{
    val ceilingFan: CeilingFan
    var prevSpeed:Int? = null
    constructor(ceilingFan: CeilingFan){
        this.ceilingFan= ceilingFan
    }

    override fun execute() {
        prevSpeed = ceilingFan.getSpeed()
        ceilingFan.off()
    }

    override fun undo() {
        if(prevSpeed == CeilingFan.LOW){
            ceilingFan.low()
        }else if(prevSpeed == CeilingFan.MEDIUM){
            ceilingFan.medium()
        }else if(prevSpeed == CeilingFan.HIGH){
            ceilingFan.high()
        }else if(prevSpeed == CeilingFan.OFF)
            ceilingFan.off()
    }
}