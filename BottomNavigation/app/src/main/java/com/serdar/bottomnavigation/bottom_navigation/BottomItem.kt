package com.serdar.bottomnavigation.bottom_navigation

import com.serdar.bottomnavigation.R

sealed class BottomItem(val title: String, val iconId: Int, val route: String){
    object Screen1: BottomItem("Home", R.drawable.home_icon, "screen_1")
    object Screen2: BottomItem("Flights", R.drawable.flight_icon, "screen_2")
    object Screen3: BottomItem("Tickets", R.drawable.ticket_icon, "screen_3")
    object Screen4: BottomItem("Profile", R.drawable.person_icon, "screen_4")
}
