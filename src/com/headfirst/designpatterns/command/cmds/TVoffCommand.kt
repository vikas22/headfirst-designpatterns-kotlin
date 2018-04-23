/*
 * Copyright (c) 22/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.command.cmds

import com.headfirst.designpatterns.command.devices.TV

class TVoffCommand:Command{
    val tv: TV

    constructor(tv:TV){
        this.tv = tv
    }
    override fun execute() {
        tv.off()

    }

    override fun undo() {
        tv.on()
    }
}