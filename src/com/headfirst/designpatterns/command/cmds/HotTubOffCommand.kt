/*
 * Copyright (c) 22/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.command.cmds

import com.headfirst.designpatterns.command.devices.HotTub

class HotTubOffCommand:Command{
    val hottub: HotTub

    constructor(hotTub:HotTub){
        this.hottub = hotTub
    }
    override fun execute() {
        hottub.off()
    }

    override fun undo() {
        hottub.on()
        hottub.heat(104)
        hottub.bubble()
    }
}