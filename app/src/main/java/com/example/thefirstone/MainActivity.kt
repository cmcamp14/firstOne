package com.example.thefirstone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.core_composables.ui.theme.LeagueAppsDemoTheme
import com.example.thefirstone.navigation.SetUpNavGraph

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LeagueAppsDemoTheme {
               val navHostController = rememberNavController()
                    SetUpNavGraph(navControllerHost = navHostController)
                }
            }
        }
    }
