package com.sol.recipecomposeapp.ui.model

import androidx.compose.runtime.Immutable
import com.sol.recipecomposeapp.Constants
import com.sol.recipecomposeapp.data.model.RecipeDto
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.toImmutableList

@Immutable
data class RecipeUiModel(
    val id: Int,
    val title: String,
    val ingredients: ImmutableList<IngredientUiModel>,
    val method: ImmutableList<String>,
    val imageUrl: String,
)

data class RecipeCardUiModel(
    val id: Int,
    val title: String,
    val imageUrl: String,
)

fun RecipeDto.toUiModel(): RecipeUiModel {
    return RecipeUiModel(
        id = id,
        title = title,
        ingredients = ingredients.map { it.toUiModel() }.toImmutableList(),
        method = method.toImmutableList(),
        imageUrl = Constants.ASSETS_URI_PREFIX + imageUrl,
    )
}

fun RecipeDto.toRecipeCardUiModel(): RecipeCardUiModel {
    return RecipeCardUiModel(
        id = id,
        title = title,
        imageUrl = imageUrl,
    )
}
