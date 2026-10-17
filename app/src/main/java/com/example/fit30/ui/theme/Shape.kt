package com.example.fit30.ui.theme

import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.ui.unit.dp

val Shapes = Shapes(
    small = CutCornerShape(topEnd = 12.dp),
    medium = RoundedCornerShape(
        topStart = 4.dp,
        topEnd = 24.dp,
        bottomEnd = 4.dp,
        bottomStart = 24.dp
    ),
    large = RoundedCornerShape(32.dp)
)
