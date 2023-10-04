package com.example.newsapp.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.navigation.NavController
import com.example.newsapp.NewsData

@Composable
fun DetailsScreen(navController: NavController, newsData: NewsData) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Details Screen",
            fontWeight = FontWeight.SemiBold
        )
        Button(onClick = { navController.navigate("TopNews") }) {
            Text(text = "Go To Details Screen + ${newsData.author}")
        }
    }
}