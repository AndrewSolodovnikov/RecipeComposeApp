package com.sol.recipecomposeapp.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

val recipesAppTypography = Typography(
    displayLarge = TextStyle(
        fontFamily = RecipeAppFonts.montserratAlternatesFontFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 20.sp
    ),

    titleMedium = TextStyle(
        fontFamily = RecipeAppFonts.montserratAlternatesFontFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 16.sp
    ),

    bodyMedium = TextStyle(
        fontFamily = RecipeAppFonts.montserratFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp
    ),

    bodySmall = TextStyle(
        fontFamily = RecipeAppFonts.montserratFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 12.sp
    ),

    labelLarge = TextStyle(
        fontFamily = RecipeAppFonts.montserratFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )
)
