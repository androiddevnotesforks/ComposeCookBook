package com.guru.composecookbook.ui.cryptoappmvvm.Models

data class Crypto(
    val symbol: String,
    val price: Double,
    val name: String,
    val image: String,
    val dailyChange: Double,
    val dailyChangePercentage: Double,
    val high: Double,
    val low: Double
)