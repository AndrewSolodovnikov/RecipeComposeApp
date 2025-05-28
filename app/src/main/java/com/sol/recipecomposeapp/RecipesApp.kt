package com.sol.recipecomposeapp

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sol.recipecomposeapp.ui.theme.RecipeAppTheme

@Composable
fun RecipeApp(innerPadding: PaddingValues) {
    TypographyTest(innerPadding)
}

@Composable
fun TypographyTest(innerPadding: PaddingValues) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
    ) {
        Text(
            text = "Заголовок (titleSmall)",
            style = MaterialTheme.typography.titleSmall
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TypographyTestPreview() {
    RecipeAppTheme {
        TypographyTest(innerPadding = PaddingValues(32.dp))
    }
}
