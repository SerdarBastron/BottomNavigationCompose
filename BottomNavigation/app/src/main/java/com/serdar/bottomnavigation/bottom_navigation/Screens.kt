package com.serdar.bottomnavigation.bottom_navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign

@Composable
fun Screen1() {
    Text(
        modifier = Modifier.fillMaxSize().wrapContentHeight(),
        text = "Home",
        textAlign = TextAlign.Center)
}

@Composable
fun Screen2() {
    Text(
        modifier = Modifier.fillMaxSize().wrapContentHeight(),
        text = "Flights",
        textAlign = TextAlign.Center)
}

@Composable
fun Screen3() {
    Text(
        modifier = Modifier.fillMaxSize().wrapContentHeight(),
        text = "Tickets",
        textAlign = TextAlign.Center)
}

@Composable
fun Screen4() {
    Text(
        modifier = Modifier.fillMaxSize().wrapContentHeight(),
        text = "Profile",
        textAlign = TextAlign.Center)
}