package oop_00000111047_AndreasRahardian.week09

fun main() { [cite: 58]
    println("=== TEST LAMBDA ===") [cite: 59]

    val sumLambda = { a: Int, b: Int -> a + b }
    println("Hasil Sum: ${sumLambda(5, 10)}") [cite: 62]

    val squareImplicit: (Int) -> Int = { it * it } [cite: 64]
    println("Hasil Square: ${squareImplicit(4)}") [cite: 65]
} [cite: 66]