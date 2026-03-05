package oop_00000111047_AndreasRahardian.week04

fun main() {

    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle(brand = "Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car(brand = "Toyota", numberOfDoors = 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    val electricCar = ElectricCar("Tesla", 4, 85)
    electricCar.accelerate()
    electricCar.honk()
    electricCar.openTrunk()

    val manager = Manager("Budi", 10000000)
    manager.work()
    println(manager.calculateBonus())

    val developer = Developer("Andi", 8000000, "Kotlin")
    developer.work()
    println(developer.calculateBonus())
}