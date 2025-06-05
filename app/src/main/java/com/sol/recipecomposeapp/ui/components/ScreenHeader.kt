package com.sol.recipecomposeapp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sol.recipecomposeapp.R
import com.sol.recipecomposeapp.ui.theme.PrimaryColor
import com.sol.recipecomposeapp.ui.theme.recipesAppTypography

@Composable
fun ScreenHeader(title: String, imgResId: Int, imgContentDescription: String) {
    Box(
        modifier = Modifier
            .height(224.dp)
            .fillMaxWidth()
    ) {
        Image(
            painterResource(imgResId),
            contentDescription = imgContentDescription,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize()
        )
        Box(
            modifier = Modifier
                .align(Alignment.BottomStart)
                .padding(16.dp)
                .clip(RoundedCornerShape(8.dp))
                .background(Color.White)
                .padding(10.dp)
        ) {
            Text(
                text = title.uppercase(),
                style = recipesAppTypography.displayLarge,
                color = PrimaryColor
                )
        }
    }
}

@Preview
@Composable
fun ScreenHeaderPreview() {
    ScreenHeader(
        "Категория",
        R.drawable.bcg_categories,
        "Описание категории"
    )
}