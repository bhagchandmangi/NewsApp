package com.example.newsapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.newsapp.NewsData

@Composable
fun DetailsScreen(newsData: NewsData, scrollState: ScrollState) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Details Screen",
            fontWeight = FontWeight.SemiBold
        )
        Image(painter = painterResource(id = newsData.image), contentDescription = "")
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            InfoWithIcon(icon = Icons.Default.Edit, info = newsData.author)
            InfoWithIcon(icon = Icons.Default.DateRange, info = newsData.author)
        }
        Text(text = newsData.title, fontWeight = FontWeight.Bold)
        Text(text = newsData.description, modifier = Modifier.padding(top = 16.dp))
    }
}

@Composable
fun InfoWithIcon(icon: ImageVector, info: String) {
    Row {
        Icon(
            icon, contentDescription = "Author",
            modifier = Modifier.padding(end = 8.dp),
            tint = Color.Cyan
        )
        Text(text = info)
    }
}