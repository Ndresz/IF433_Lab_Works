package oop_00000111047_AndreasRahardian.week03

fun main() {
    val e = Employee("Budi")

    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    e.increasePerformance()

    println("Pajak yang harus dibayar: ${e.tax}")
}

fun main() {

    println("--- TEST WEAPON ---")
    val sword = Weapon("Excalibur")

    sword.damage = -50
    sword.damage = 9999

    println("Damage: ${sword.damage}")
    println("Tier: ${sword.tier}")
}
