package oop_00000111047_AndreasRahardian.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}