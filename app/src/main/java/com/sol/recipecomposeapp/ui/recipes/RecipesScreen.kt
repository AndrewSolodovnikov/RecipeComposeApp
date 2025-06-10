package com.sol.recipecomposeapp.ui.recipes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sol.recipecomposeapp.R
import com.sol.recipecomposeapp.ui.components.ScreenHeader
import com.sol.recipecomposeapp.ui.theme.BackgroundColor

@Composable
fun RecipesScreen(innerPadding: PaddingValues) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
            .background(BackgroundColor)
    ) {
        ScreenHeader(
            title = stringResource(R.string.recipes),
            imgResId = R.drawable.bcg_recipes_list,
            imgContentDescription = stringResource(R.string.recipes)
        )
    }
}

@Preview
@Composable
fun RecipeScreenPreview() {
    RecipesScreen(innerPadding = PaddingValues(0.dp))
}
