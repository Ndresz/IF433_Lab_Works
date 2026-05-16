package oop_00000111047_AndreasRahardian.week12

fun main() {
    println("=== TEST RUNCATCHING ===")
    val result: Result<Int> = runCatching {
        "42X".toInt()
    }

    val safeValue = result.getOrElse { -1 }
    println("Safe value (getOrElse): $safeValue")

    val recovered = result.recover {0}.getOrNull()
    println("Recovered Value: $recovered")
}