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
}