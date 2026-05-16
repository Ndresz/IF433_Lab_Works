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

fun main() {
    println("=== TEST MULTIPLE CATCH ===")
    val account = BankAccount(100.0)

    try {
        account.withdraw(150.0)
    } catch (e: InsufficientFundsException) {
        println("Caught Domnin Error: Uang tidak cukup. ${e.message}")
    } catch (e: IllegalArgumentException) {
        println ("Caught Argument Error: Input tidak valid. ${e.message}")
    }
    catch (e: Exception) {
        println ("Caught General Error: Terjadi kesalahan tidak terduga.")
    }
}