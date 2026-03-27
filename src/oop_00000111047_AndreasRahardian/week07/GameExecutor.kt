package oop_00000111047_AndreasRahardian.week07

fun processEvent(event: BattleState) {
    when (event) {
        is MonsterEncounter -> println("Bertemu monster: ${event.monsterName}")
        is LootDropped -> {
            val (name, _, rarity) = event.item
            println("Mendapat loot: $name (Rarity: $rarity)")
        }
        is GameOver -> println("Game Over karena: ${event.reason}")
        SafeZone -> println("Kamu berada di zona aman.")
    }
}