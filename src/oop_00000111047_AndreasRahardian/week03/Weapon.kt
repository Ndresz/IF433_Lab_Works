package oop_00000111047_AndreasRahardian.week03

class Weapon(val name: String) {

    var damage: Int = 0
        set(value) {
            when {
                value < 0 -> {
                    println("Error: Damage tidak boleh negatif!")
                }
                value > 1000 -> {
                    println("Warning: Damage terlalu besar! Diset ke 1000.")
                    field = 1000
                }
                else -> {
                    field = value
                }
            }
        }

    val tier: String
        get() = when {
            damage > 800 -> "Legendary"
            damage > 500 -> "Epic"
            else -> "Common"
        }
}