package com.example.fit30.entity

import androidx.annotation.DrawableRes

data class FitnessDay(
    val day: Int,
    @DrawableRes val imageRes: Int,
    val title: String,
    val description: String
)
