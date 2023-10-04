package com.example.newsapp

object MockData {
    val topNewsList = listOf<NewsData>(
        NewsData(
            1,
            image = R.drawable.person_02,
            author = "Mangi",
            title = "jetpack Compose",
            description = "Picker is the most powerful men",
            publishedAt = "12:23:00:09:10:2023"
        ),
        NewsData(
            1,
            image = R.drawable.person_02,
            author = "Mangi",
            title = "jetpack Compose",
            description = "Picker is the most powerful men",
            publishedAt = "12:23:00:09:10:2023"
        ),
        NewsData(
            1,
            image = R.drawable.person_02,
            author = "Mangi",
            title = "jetpack Compose",
            description = "Picker is the most powerful men",
            publishedAt = "12:23:00:09:10:2023"
        ),
        NewsData(
            1,
            image = R.drawable.person_02,
            author = "Mangi",
            title = "jetpack Compose",
            description = "Picker is the most powerful men",
            publishedAt = "12:23:00:09:10:2023"
        ),NewsData(
            1,
            image = R.drawable.person_02,
            author = "Mangi",
            title = "jetpack Compose",
            description = "Picker is the most powerful men",
            publishedAt = "12:23:00:09:10:2023"
        ),NewsData(
            1,
            image = R.drawable.person_02,
            author = "Mangi",
            title = "jetpack Compose",
            description = "Picker is the most powerful men",
            publishedAt = "12:23:00:09:10:2023"
        ),
        NewsData(
            1,
            image = R.drawable.person_02,
            author = "Mangi",
            title = "jetpack Compose",
            description = "Picker is the most powerful men",
            publishedAt = "12:23:00:09:10:2023"
        ),
        NewsData(
            1,
            image = R.drawable.person_02,
            author = "Mangi",
            title = "jetpack Compose",
            description = "Picker is the most powerful men",
            publishedAt = "12:23:00:09:10:2023"
        ),
    )
    fun getNews(newsId: Int?):NewsData{
        return topNewsList.first{it.id == newsId}
    }
}