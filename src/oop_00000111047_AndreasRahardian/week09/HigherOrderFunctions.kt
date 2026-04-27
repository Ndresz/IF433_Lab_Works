package oop_00000111047_AndreasRahardian.week09

fun main() { [cite: 74]
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8) [cite: 75]
    println("Original Data: $numbers") [cite: 76]

    println("\n=== HOF: FILTER ===") [cite: 77]
    val evens = numbers.filter { it % 2 == 0 }
    println("Evens only: $evens") [cite: 80]

    println("\n=== HOF: MAP ===") [cite: 84]
    val multiplied = evens.map { it * 10 } [cite: 86]
    val asStrings = multiplied.map { "Rp ${it}k" } [cite: 87]
    println("Multiplied: $multiplied") [cite: 88]
    println("Formatted: $asStrings") [cite: 89]

    println("\n=== HOF: SORTED & FOREACH ===") [cite: 93]
    val randomNames = listOf("Charlie", "Alice", "Bob") [cite: 94]
    val sortedReverse = randomNames.sortedByDescending { it } [cite: 96]

    sortedReverse.forEach { name ->
        println("User: $name") [cite: 98]
    } [cite: 99]
}