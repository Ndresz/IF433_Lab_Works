package oop_00000111047_AndreasRahardian.week12

sealed class FeederException(msg : String) : Exception(msg)

class FoodEmptyException(requested: Int, available: Int) :
        FeederException("KIbble tidak cukup! Diminta $requested gr, sisa $available gr")

class DispenserJamException :
        FeederException("Wadah dispenser tersangkut/macet")