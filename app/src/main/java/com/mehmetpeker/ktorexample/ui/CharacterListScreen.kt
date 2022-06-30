package com.mehmetpeker.ktorexample.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.mehmetpeker.ktorexample.data.dto.Result

@Composable
fun CharacterListScreen(
    characters: List<Result>
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text("Rick And Morty")
                })
        })
    {
        LazyColumn {
            items(characters) {
                CharacterItem(item = it)
            }
        }
    }
}

@Composable
fun CharacterItem(item: Result) {
    Card(
        modifier = Modifier.padding(8.dp),
        elevation = 4.dp,
        shape = RoundedCornerShape(8.dp)
    ) {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            AsyncImage(
                model = item.image,
                contentDescription = null,
                modifier = Modifier
                    .size(48.dp)
                    .clip(
                        RoundedCornerShape(percent = 50)
                    )
            )
            Column(
                Modifier
                    .fillMaxWidth()
                    .padding(start = 8.dp)
            ) {
                Text(item.name)
                Text("${item.species} - ${item.status}")
            }
        }
    }
}