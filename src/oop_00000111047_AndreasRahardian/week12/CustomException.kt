package oop_00000111047_AndreasRahardian.week12

class InsufficientFundsException (
    val amount: Double,
    val balance: Double
) : Exception("Atttempted $amount, balance: $balance")

class BankAccount(val balance: Double){
    fun withdraw(amount: Double){
        if (amount < 0) {
            throw IllegalArgumentException("Amount must be possitive")
        }
        if (amount > balance) {
            throw InsufficientFundsException(amount, balance)
        }
        balance -= amount
        println("Withdraw successful. Remaining  balance: $balance")
    }
}