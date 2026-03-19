package oop_00000111047_AndreasRahardian.week06

class Smartphone: Camera, Phone {
    override fun turnon() {
        super<Camera>.turnon()
        super<Phone>.turnon()
        println("Sistem operasi Smartphone berhasil booting.")
    }
}