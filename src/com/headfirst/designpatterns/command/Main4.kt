/*
 * Copyright (c) 22/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.command

import com.headfirst.designpatterns.command.cmds.Command
import com.headfirst.designpatterns.command.devices.*

fun main(args:Array<String>){
    println("Command pattern")

    val remoteControl = RemoteControl()
    val livingRoomLight = Light("Living Room")
    val ceilingFan = CeilingFan("Living Room")
    val tv = TV("Living Room")
    val stereo = Stereo("Living Room")
    val hotTub = HotTub()


    remoteControl.setCommand(
            0,
            object :Command{
                override fun execute() {
                    livingRoomLight.on()
                }

                override fun undo() {
                    livingRoomLight.off()
                }
            },
            object :Command{
                override fun execute() {
                    livingRoomLight.off()
                }

                override fun undo() {
                    livingRoomLight.on()
                }
            }
    )

    remoteControl.setCommand(1,
            object :Command {
                override fun execute() {
                    ceilingFan.low()
                }

                override fun undo() {
                    ceilingFan.off()
                }
            },
            object :Command {
                override fun execute() {
                    ceilingFan.off()
                }

                override fun undo() {
                    ceilingFan.low()
                }}
    )

    remoteControl.setCommand(2,
            object :Command{
                override fun execute() {
                    tv.on()
                    tv.setDVD()
                }

                override fun undo() {
                    tv.off()
                }
            },
            object :Command{
                override fun execute() {
                    tv.off()
                }

                override fun undo() {
                    tv.on()
                    tv.setDVD()
                }}
    )


    remoteControl.setCommand(3,
            object :Command{
                override fun execute() {
                    stereo.on()
                    stereo.setDVD()
                    stereo.setVolume(10)
                }

                override fun undo() {
                    stereo.off()
                }
            },
            object :Command{
                override fun execute() {
                    stereo.off()
                 }

                override fun undo() {
                    stereo.on()
                    stereo.setDVD()
                    stereo.setVolume(10)
                }}
    )

    remoteControl.setCommand(4,
            object :Command{
                override fun execute() {
                    hotTub.on()
                    hotTub.heat(104)
                    hotTub.bubble()
                }

                override fun undo() {
                    hotTub.off()
                }
            },
            object :Command{
                override fun execute() {
                hotTub.off()
                }

                override fun undo() {
                    hotTub.on()
                    hotTub.heat(104)
                    hotTub.bubble()
                }
            }
    )


    remoteControl.buttonOnWasPushed(0)
    remoteControl.buttonOnWasPushed(1)
    remoteControl.buttonOnWasPushed(2)
    remoteControl.buttonOnWasPushed(3)
    remoteControl.buttonOnWasPushed(4)


    remoteControl.buttonOffWasPushed(0)
    remoteControl.buttonOffWasPushed(1)
    remoteControl.buttonOffWasPushed(2)
    remoteControl.buttonOffWasPushed(3)
    remoteControl.buttonOffWasPushed(4)



}