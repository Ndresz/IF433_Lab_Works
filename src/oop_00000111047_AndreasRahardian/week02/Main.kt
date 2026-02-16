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

    print("Masukkan Nama Hero: ")
    val heroName = scanner.nextLine()

    print("Masukkan Base Damage Hero: ")
    val heroDamage = scanner.nextInt()

    val hero = Hero(heroName, heroDamage)
    var enemyHp = 100

    while (hero.isAlive() && enemyHp > 0) {

        println("\n1. Serang")
        println("2. Kabur")
        val action = scanner.nextInt()

        if (action == 1) {
            hero.attack("Enemy")

            enemyHp -= hero.baseDamage
            if (enemyHp < 0) enemyHp = 0

            println("HP Musuh: $enemyHp")

            if (enemyHp > 0) {
                val damage = (10..20).random()
                println("Musuh menyerang balik sebesar $damage!")
                hero.takeDamage(damage)
                println("HP Hero: ${hero.hp}")
            }

        } else {
            println("Kamu kabur dari pertarungan!")
            break
        }
    }

    println("\n=== HASIL PERTARUNGAN ===")

    if (hero.isAlive() && enemyHp == 0) {
        println("Hero MENANG!")
    } else if (!hero.isAlive()) {
        println("Hero KALAH!")
    } else {
        println("Pertarungan dihentikan.")
    }
}