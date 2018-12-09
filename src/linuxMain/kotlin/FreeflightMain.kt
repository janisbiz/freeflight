package freeflightMain

import wiringPi.*
import kotlinx.cinterop.*

fun hello(): String = "Hello, Kotlin/Native! Build! AAA"

fun main(args: Array<String>) {
    println(hello())

    wiringPi.wiringPiSetup()
}