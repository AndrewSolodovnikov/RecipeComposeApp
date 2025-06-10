package com.sol.recipecomposeapp

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.sol.recipecomposeapp.ui.categories.CategoriesScreen
import com.sol.recipecomposeapp.ui.navigation.BottomNavigation

@Composable
fun RecipeApp() {
    var currentScreen by remember { mutableStateOf(ScreenId.CATEGORIES) }

    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .navigationBarsPadding(),
        bottomBar = {
            BottomNavigation(
                onCategoriesClick = { currentScreen = ScreenId.CATEGORIES },
                onFavoriteClick = { currentScreen = ScreenId.FAVORITES }
            )
        }
    ) { innerPadding ->
        when (currentScreen) {
            ScreenId.CATEGORIES -> CategoriesScreen(innerPadding)
            ScreenId.FAVORITES -> FavoriteScreen(innerPadding)
        }
    }
}

@Composable
fun FavoriteScreen(innerPadding: PaddingValues) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "FavoriteScreen",
            style = MaterialTheme.typography.titleSmall
        )
    }
}
