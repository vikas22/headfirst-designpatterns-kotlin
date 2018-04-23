/*
 * Copyright (c) 22/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.command.cmds

import com.headfirst.designpatterns.command.devices.HotTub

class HotTubOnCommand:Command{
    val hottub: HotTub

    constructor(hotTub:HotTub){
        this.hottub = hotTub
    }
    override fun execute() {
        hottub.on()
        hottub.heat(104)
        hottub.bubble()

    }

    override fun undo() {
        hottub.off()
    }
}