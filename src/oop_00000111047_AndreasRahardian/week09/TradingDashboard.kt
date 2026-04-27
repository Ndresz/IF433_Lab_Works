package oop_00000111047_AndreasRahardian.week09

fun main() {
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 50, 120.0, "OPEN"),
        TradeLog("SOLUSDT", "LONG", 10, -2.0, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 20, 25.0, "CLOSED"),
        TradeLog("BNBUSDT", "SHORT", 5, 1.5, "CLOSED")
    )
    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }