package oop_00000111047_AndreasRahardian.week05

fun main() {
    val dosen1 = Dosen(nama = "Pak Alex", nidn = "0123456")
    val admin1 = Admin(nama = "Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        pegawai.bekerja()

        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println()
    }
    println("=== TUGAS MANDIRI 1 ===")
    val math = MathHelper()
    println("Luas Persegi (sisi 4): ${math.hitungLuas(4)}")
    println("Luas Persegi Panjang (4x5): ${math.hitungLuas(4, 5)}")
    println("Luas Lingkaran (r 7.0): ${math.hitungLuas(7.0)}")
    println()

    println("=== TUGAS MANDIRI 2 ===")
    val wallet = EWallet(accountName = "John EWallet", balance = 50000.0)
    val cc = CreditCard(accountName = "John CreditCard", limit = 100000.0)

    val payments: List<PaymentMethod> = listOf(wallet, cc)

    for (payment in payments) {
        println("Mencoba pembayaran 75000 untuk ${payment.accountName}...")
        payment.processPayment(75000.0)

        if (payment is EWallet && payment.balance < 75000.0) {
            println("=> Saldo tidak cukup, melakukan top-up otomatis...")
            payment.topUp(50000.0)
            println("=> Mencoba ulang pembayaran...")
            payment.processPayment(75000.0)
        }
        println()
    }
}