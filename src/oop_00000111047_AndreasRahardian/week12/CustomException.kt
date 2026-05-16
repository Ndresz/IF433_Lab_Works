package oop_00000111047_AndreasRahardian.week12

class InsufficientFundsException (
    val amount: Double,
    val balance: Double
) : Exception("Atttempted $amount, balance: $balance")