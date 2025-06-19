package com.sol.recipecomposeapp

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.sol.recipecomposeapp.ui.categories.CategoriesScreen
import com.sol.recipecomposeapp.ui.favorites.FavoritesScreen
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
            ScreenId.FAVORITES -> FavoritesScreen(innerPadding)
        }
    }
}
