package com.sol.recipecomposeapp.ui.categories

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.sol.recipecomposeapp.R
import com.sol.recipecomposeapp.ui.components.ScreenHeader

@Composable
fun CategoriesScreen(innerPadding: PaddingValues) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding),
        contentAlignment = Alignment.TopCenter
    ) {
        ScreenHeader(
            stringResource(R.string.categories),
            R.drawable.bcg_categories,
            stringResource(R.string.categories)
        )
    }
}
