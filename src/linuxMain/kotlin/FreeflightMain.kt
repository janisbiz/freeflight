package freeflightMain

import kotlinx.cinterop.*
import wiringPi.*

fun hello(): String = "Hello, Kotlin/Native! Build! AAA"

fun main(args: Array<String>) {
    println(hello())

    wiringPiSetup()
}