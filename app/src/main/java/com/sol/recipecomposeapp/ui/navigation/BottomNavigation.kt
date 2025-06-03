package com.sol.recipecomposeapp.ui.navigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sol.recipecomposeapp.R
import com.sol.recipecomposeapp.ui.theme.AccentBlue
import com.sol.recipecomposeapp.ui.theme.AccentColor


@Composable
fun BottomNavigation(
    onCategoriesClick: () -> Unit,
    onFavoriteClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp),
        horizontalArrangement = Arrangement.spacedBy(4.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        BottomNavigationButton(
            modifier = Modifier.weight(1f),
            text = "Категории",
            onClick = onCategoriesClick,
            backgroundColor = AccentBlue,
        )
        BottomNavigationButton(
            modifier = Modifier.weight(1f),
            text = "Избранное",
            onClick = onFavoriteClick,
            backgroundColor = AccentColor,
            iconResId = R.drawable.ic_favorite,
        )
    }
}

@Composable
fun BottomNavigationButton(
    modifier: Modifier = Modifier,
    text: String,
    onClick: () -> Unit,
    backgroundColor: Color,
    iconResId: Int? = null,
) {
    Button(
        onClick = onClick,
        shape = RoundedCornerShape(8.dp),
        colors = ButtonDefaults.buttonColors(containerColor = backgroundColor),
        modifier = modifier
            .height(36.dp)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(
                text = text.uppercase(),
                color = Color.White,
                style = MaterialTheme.typography.titleMedium
            )
            if (iconResId != null) {
                Spacer(modifier = Modifier.width(4.dp))
                Icon(
                    painter = painterResource(id = iconResId),
                    contentDescription = text,
                    tint = Color.White
                )
            }
        }
    }
}

@Preview
@Composable
fun BottomNavigationPreview() {
    BottomNavigation(
        onCategoriesClick = {},
        onFavoriteClick = {}
    )
}
