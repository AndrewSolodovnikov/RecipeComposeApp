package com.sol.recipecomposeapp.data.repository

import com.sol.recipecomposeapp.data.model.CategoryDto
import com.sol.recipecomposeapp.data.model.IngredientDto
import com.sol.recipecomposeapp.data.model.RecipeDto

object RecipesRepositoryStub {

    private val categories = listOf(
        CategoryDto(
            id = 0,
            title = "Бургеры",
            description = "Рецепты всех популярных видов бургеров",
            imageUrl = "file:///android_asset/burger.png"
        ),
        CategoryDto(
            id = 1,
            title = "Десерты",
            description = "Самые вкусные рецепты десертов специально для вас",
            imageUrl = "file:///android_asset/dessert.png"
        ),
        CategoryDto(
            id = 2,
            title = "Пицца",
            description = "Пицца на любой вкус и цвет. Лучшая подборка для тебя",
            imageUrl = "file:///android_asset/pizza.png"
        ),
        CategoryDto(
            id = 3,
            title = "Рыба",
            description = "Печеная, жареная, сушеная, любая рыба на твой вкус",
            imageUrl = "file:///android_asset/fish.png"
        ),
        CategoryDto(
            id = 4,
            title = "Супы",
            description = "От классики до экзотики: мир в одной тарелке",
            imageUrl = "file:///android_asset/soup.png"
        ),
        CategoryDto(
            id = 5,
            title = "Салаты",
            description = "Хрустящий калейдоскоп под соусом вдохновения",
            imageUrl = "file:///android_asset/salad.png"
        )
    )


    private val recipes = listOf(
        RecipeDto(
            id = 0,
            title = "Классический бургер с говядиной",
            ingredients = listOf(
                IngredientDto("0.5", "кг", "говяжий фарш"),
                IngredientDto("1.0", "шт", "луковица, мелко нарезанная"),
                IngredientDto("2.0", "зубч", "чеснок, измельченный"),
                IngredientDto("4.0", "шт", "булочки для бургера"),
                IngredientDto("4.0", "шт", "листа салата"),
                IngredientDto("1.0", "шт", "помидор, нарезанный кольцами"),
                IngredientDto("2.0", "ст. л.", "горчица"),
                IngredientDto("2.0", "ст. л.", "кетчуп"),
                IngredientDto("по вкусу", "", "соль и черный перец")
            ),
            method = listOf(
                "1. В глубокой миске смешайте говяжий фарш, лук, чеснок, соль и перец. Разделите фарш на 4 равные части и сформируйте котлеты.",
                "2. Разогрейте сковороду на среднем огне. Обжаривайте котлеты с каждой стороны в течение 4–5 минут или до желаемой степени прожарки.",
                "3. В то время как котлеты готовятся, подготовьте булочки. Разрежьте их пополам и обжарьте на сковороде до золотистой корочки.",
                "4. Смазать нижние половинки булочек горчицей и кетчупом, затем положите лист салата, котлету, кольца помидора и закройте верхней половинкой булочки.",
                "5. Подавайте бургеры горячими с картофельными чипсами или картофельным пюре."
            ),
            imageUrl = "https://images.google.com",
        )
    )

    fun getCategories(): List<String> {
        return categories.map { it.title }
    }

    fun getRecipesByCategoryId(categoryId: Int): List<RecipeDto> {
        return if (categoryId == 0) recipes else emptyList()
    }
}
