package oop_00000111047_AndreasRahardian.week07

package oop_001_johnthor.week07

object DatabaseManager {
    var connectionStatus: String = "Disconnected"

    fun connect() {
        connectionStatus = "Connected to Server"
        println("Database is ready.")
    }
}