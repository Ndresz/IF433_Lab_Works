package oop_00000111047_AndreasRahardian.week07

package oop_001_johnthor.week07

class NetworkClient private constructor (val url: String) {
    fun connect() {
        println("Connecting to $url...")
    }
}