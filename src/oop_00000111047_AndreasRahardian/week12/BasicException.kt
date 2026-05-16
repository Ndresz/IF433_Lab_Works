package oop_00000111047_AndreasRahardian.week12

fun divide (a: Int, b: Int): Int {
    try{
        return a / b
    } catch (e: ArithmeticException) {
        println("Error: ${e.message}")
        return -1
    } finally {
        println("Division attempt finised")
    }
}

fun main() {
    println("=== TEST TRY AS EXPRESSION===")
    val inputString = "123A"

    val result: Int = try{
        Integer.parseInt(inputString)
    } catch (e: NumberFormatException) {
        -1
    }
}