package oop_00000111047_AndreasRahardian.week03

class Employee(val name: String) {
    var salary: Int = 0
        set(value) {
            println("Mencoba gaji ke: $value")
            this.salary = value
        }
}