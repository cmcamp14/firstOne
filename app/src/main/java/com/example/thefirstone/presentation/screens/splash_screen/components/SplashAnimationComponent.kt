package com.example.thefirstone.presentation.screens.splash_screen.components

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.thefirstone.R
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

@Composable
fun SplashAnimationComponent(
    navigateForward: () -> Unit
){
    val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.knife))
    val progress by animateLottieCompositionAsState(composition)

    LaunchedEffect(progress) {
        if (progress == 1f) {
            withContext(Dispatchers.Main) {
                navigateForward()
            }
        }
    }
    LottieAnimation(
        composition = composition,
        progress = progress,
    )
}