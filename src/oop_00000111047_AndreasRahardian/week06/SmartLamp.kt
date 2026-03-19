package oop_00000111047_AndreasRahardian.week06

class SmartLamp(override val id: String, override val name: String) : SmartDevice, Switchable {
    override fun turnOn() {
        println("$name menyala terang.")
    }

    override fun turnOff() {
        println("$name dimatikan.")
    }
}