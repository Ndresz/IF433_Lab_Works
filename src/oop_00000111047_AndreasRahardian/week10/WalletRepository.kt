package oop_00000111047_AndreasRahardian.week10

class WalletRepository<T> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }

    fun findByName(nameQuery: String): T? {
        return items.find { (it as? Coin)?.name == nameQuery }
    }
}