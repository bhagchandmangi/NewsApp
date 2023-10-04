package com.example.newsapp.ui

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.newsapp.MockData
import com.example.newsapp.ui.screens.DetailsScreen
import com.example.newsapp.ui.screens.TopNews

@Composable
fun NewsApp() {
    Navigation()
}
@Composable
fun Navigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "TopNews") {
        composable("TopNews"){
            TopNews(navController = navController)
        }
        composable("Details/{newsId}",
            arguments = listOf(
                navArgument("newsId"){
                    type = NavType.IntType
                }
            )){
            navBackStackEntry ->
            val id = navBackStackEntry.arguments?.getInt("newsId")
            val newsData = MockData.getNews(id)
            DetailsScreen(navController = navController, newsData)
        }
    }
}