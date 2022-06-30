package com.mehmetpeker.ktorexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.produceState
import androidx.compose.ui.Modifier
import com.mehmetpeker.ktorexample.data.dto.Result
import com.mehmetpeker.ktorexample.data.remote.ApiClient
import com.mehmetpeker.ktorexample.data.remote.ApiServiceImpl
import com.mehmetpeker.ktorexample.ui.CharacterListScreen
import com.mehmetpeker.ktorexample.ui.theme.KtorExampleTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val apiService = ApiServiceImpl(ApiClient.getClient)
        setContent {
            val characters = produceState<List<Result>>(initialValue = emptyList(), producer = {
                val result = apiService.getAllCharacters().results
                value = result
            })
            KtorExampleTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                  CharacterListScreen(characters =  characters.value)
                }
            }
        }
    }
}
