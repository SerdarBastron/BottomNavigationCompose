import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.serdar.bottomnavigation.bottom_navigation.Screen1
import com.serdar.bottomnavigation.bottom_navigation.Screen2
import com.serdar.bottomnavigation.bottom_navigation.Screen3
import com.serdar.bottomnavigation.bottom_navigation.Screen4

@Composable
fun NavGraph(
    navHostController: NavHostController
) {
    NavHost(navController = navHostController, startDestination = "screen_1"){
        composable("screen_1"){
            Screen1()
        }
        composable("screen_2"){
            Screen2()
        }
        composable("screen_3"){
            Screen3()
        }
        composable("screen_4"){
            Screen4()
        }
    }
}