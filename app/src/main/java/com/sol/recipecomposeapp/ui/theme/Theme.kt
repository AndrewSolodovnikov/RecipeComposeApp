package com.sol.recipecomposeapp.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

private val RecipesAppLightColorScheme = lightColorScheme(
    primary = PrimaryColor,
    onPrimary = Color.White,
    secondary = AccentBlue,
    onSecondary = Color.White,
    tertiary = AccentColor,
    onTertiary = Color.White,

    background = BackgroundColor,
    onBackground = TextPrimaryColor,
    surface = SurfaceColor,
    onSurface = TextPrimaryColor,
    surfaceVariant = SurfaceVariantColor,
    onSurfaceVariant = TextSecondaryColor,
    outline = DividerColor
)

private val RecipesAppDarkColorScheme = darkColorScheme(
    primary = PrimaryColorDark,
    onPrimary = Color.Black,
    secondary = AccentBlueDark,
    onSecondary = Color.Black,
    tertiary = AccentColorDark,
    onTertiary = Color.Black,

    background = BackgroundColorDark,
    onBackground = TextPrimaryColorDark,
    surface = SurfaceColorDark,
    onSurface = TextPrimaryColorDark,
    surfaceVariant = SurfaceVariantColor,
    onSurfaceVariant = TextSecondaryColorDark,
    outline = DividerColor
)

@Composable
fun RecipeAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> RecipesAppDarkColorScheme
        else -> RecipesAppLightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = recipesAppTypography,
        content = content
    )
}