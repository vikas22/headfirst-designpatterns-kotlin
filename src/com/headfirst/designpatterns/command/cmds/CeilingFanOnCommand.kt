/*
 * Copyright (c) 22/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.command.cmds

import com.headfirst.designpatterns.command.devices.CeilingFan

class CeilingFanOnCommand:Command{
    val ceilingFan: CeilingFan

    constructor(ceilingFan: CeilingFan){
        this.ceilingFan= ceilingFan
    }

    override fun execute() {
        ceilingFan.low()
    }

    override fun undo() {
        ceilingFan.off()
    }
}