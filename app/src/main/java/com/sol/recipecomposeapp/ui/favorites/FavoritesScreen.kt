package com.sol.recipecomposeapp.ui.favorites

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sol.recipecomposeapp.R
import com.sol.recipecomposeapp.ui.components.ScreenHeader
import com.sol.recipecomposeapp.ui.theme.BackgroundColor
import com.sol.recipecomposeapp.ui.theme.recipesAppTypography

@Composable
fun FavoritesScreen(innerPadding: PaddingValues) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
            .background(BackgroundColor)
    ) {
        ScreenHeader(
            title = stringResource(R.string.fovorite),
            imgResId = R.drawable.bcg_favorites,
            imgContentDescription = stringResource(R.string.fovorite)
        )
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(BackgroundColor),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = stringResource(R.string.none_added_to_favorites),
                modifier = Modifier
                    .padding(16.dp),
                textAlign = TextAlign.Center,
                style = recipesAppTypography.labelLarge
            )
        }
    }
}

@Preview
@Composable
fun FavoritesScreenPreview() {
    FavoritesScreen(innerPadding = PaddingValues(0.dp))
}
