package oop_00000111047_AndreasRahardian.week10

fun main() {

    // 5. Inisialisasi Dashboard
    val coinRepo = WalletRepository<Coin>()

    // (Jalankan Checkpoint 15 sekarang)

    // 6. Mengisi Data Dompet
    coinRepo.add(Coin("BTC", 0.5))
    coinRepo.add(Coin("ETH", 5.0))
    coinRepo.add(Coin("USDT", 1000.0))

    // (Jalankan Checkpoint 16 sekarang)

    // 7. Simulasi Response Jaringan
    val response = ApiResponse("200 OK", coinRepo.getAll())

    // (Jalankan Checkpoint 17 sekarang)

    // 8. Menampilkan Data
    println("Status Response: ${response.status}")
    response.data.forEach { coin ->
        println("Coin: ${coin.name} | Balance: ${coin.balance}")
    }
    // (Jalankan Checkpoint 18 sekarang)

    // 9. Menambahkan Transaksi
    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("TXN-001", 0.25))
    txRepo.add(Transaction("TXN-002", 1.5))
    println("\nTotal Transaksi dalam Repository: ${txRepo.getAll().size}")

}