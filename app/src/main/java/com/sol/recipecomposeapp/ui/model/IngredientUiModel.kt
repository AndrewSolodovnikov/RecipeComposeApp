package com.sol.recipecomposeapp.ui.model

import com.sol.recipecomposeapp.data.model.IngredientDto

data class IngredientUiModel(
    val quantity: String,
    val unitOfMeasure: String,
    val description: String,
)

fun IngredientDto.toUiModel(): IngredientUiModel {
    return IngredientUiModel(
        quantity = quantity,
        unitOfMeasure = unitOfMeasure,
        description = description,
    )
}
