package com.sol.recipecomposeapp.ui.model

import androidx.compose.runtime.Immutable
import com.sol.recipecomposeapp.Constants
import com.sol.recipecomposeapp.data.model.CategoryDto

@Immutable
data class CategoryUiModel(
    val id: Int,
    val title: String,
    val description: String,
    val imageUrl: String,
)

fun CategoryDto.toUiModel(): CategoryUiModel {
    return CategoryUiModel(
        id = id,
        title = title,
        description = description,
        imageUrl = Constants.ASSETS_URI_PREFIX + imageUrl,
    )
}
