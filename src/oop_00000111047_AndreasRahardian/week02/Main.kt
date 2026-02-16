package oop_00000111047_AndreasRahardian.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    print("Masukkan NIM (5 digit): ")
    val nim = scanner.nextLine()

    print("Masukkan Jurusan: ")
    val major = scanner.nextLine()

    if (nim.length == 5) {
        val student = Student(name, nim, major)
    } else {
        println("Input NIM tidak valid. Objek tidak dibuat.")
    }
    println("Pilih Jalur:")
    println("1. Regular")
    println("2. Belum pilih jurusan")
    val choice = scanner.nextInt()
    scanner.nextLine()

    if (choice == 1) {
        val student = Student(name, nim, major)
    } else {
        val student = Student(name, nim)
    }

    print("Judul Buku: ")
    val title = scanner.nextLine()

    print("Peminjam: ")
    val borrower = scanner.nextLine()

    print("Lama Pinjam (hari): ")
    var duration = scanner.nextInt()

    if (duration < 1) {
        println("Durasi tidak boleh minus. Diubah menjadi 1 hari.")
        duration = 1
    }

    val loan = Loan(title, borrower, duration)

    println("Total Denda: Rp ${loan.calculateFine()}")
}