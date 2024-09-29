package com.example.walkthrough_theming.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.*
import androidx.compose.runtime.Composable

private val LightColors = lightColorScheme(
    primary = Orange,
)

private val DarkColors = darkColorScheme(
    primary = Orange
)

@Composable
fun MyTheme(
    darkTheme: Boolean = isSystemInDarkTheme(), // Choose theme based on system setting
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColors else LightColors

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,  // Refer to Type.kt typography
        content = content
    )
}