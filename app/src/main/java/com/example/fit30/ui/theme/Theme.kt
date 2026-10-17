package com.example.fit30.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val LightColors = lightColorScheme(
    primary = Green40,
    onPrimary = Green90,
    primaryContainer = Green90,
    onPrimaryContainer = Green10,
    secondary = Orange40,
    onSecondary = Orange90,
    secondaryContainer = Orange90,
    onSecondaryContainer = Orange10,
    tertiary = Slate40,
    tertiaryContainer = Slate90,
    onTertiaryContainer = Slate10,
    background = SurfaceLight,
    surface = SurfaceLight
)

private val DarkColors = darkColorScheme(
    primary = Green80,
    onPrimary = Green10,
    primaryContainer = Green40,
    onPrimaryContainer = Green90,
    secondary = Orange80,
    onSecondary = Orange10,
    secondaryContainer = Orange40,
    onSecondaryContainer = Orange90,
    tertiary = Slate80,
    tertiaryContainer = Slate40,
    onTertiaryContainer = Slate90,
    background = SurfaceDark,
    surface = SurfaceDark
)

@Composable
fun Fit30Theme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = if (darkTheme) DarkColors else LightColors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}
