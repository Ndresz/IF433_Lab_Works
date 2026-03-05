package oop_00000111047_AndreasRahardian.week04

open class Vehicle(val brand: String) {

    open fun honk() {
        println("$brand berbunyi: Tiiin!")
    }

    open fun accelerate() {
        println("$brand sedang berakselerasi.")
    }
}