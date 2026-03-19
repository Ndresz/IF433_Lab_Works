package oop_00000111047_AndreasRahardian.week06

class Button(override val name: String) : Clickable {
    override fun onClick() {
        println("$name clicked")
    }
}