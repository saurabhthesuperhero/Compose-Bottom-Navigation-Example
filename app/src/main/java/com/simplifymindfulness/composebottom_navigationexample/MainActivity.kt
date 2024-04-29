package com.simplifymindfulness.composebottom_navigationexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.simplifymindfulness.composebottom_navigationexample.ui.theme.ComposeBottomNavigationExampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeBottomNavigationExampleTheme {
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    AppNavigation()
                    //TODO Check this out https://stackoverflow.com/questions/71395630/jetpack-compose-navigate-both-with-and-without-bottombar/71425065#71425065
                }
            }
        }
    }
}

