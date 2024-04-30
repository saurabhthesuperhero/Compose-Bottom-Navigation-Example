package com.simplifymindfulness.composebottom_navigationexample

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.simplifymindfulness.composebottom_navigationexample.composables.BottomScreen1
import com.simplifymindfulness.composebottom_navigationexample.composables.BottomScreen2
import com.simplifymindfulness.composebottom_navigationexample.composables.NavigationItem
import com.simplifymindfulness.composebottom_navigationexample.composables.Screen1
import com.simplifymindfulness.composebottom_navigationexample.composables.Screen2
import com.simplifymindfulness.composebottom_navigationexample.composables.Screen3
import com.simplifymindfulness.composebottom_navigationexample.composables.Screen4

@Composable
fun AppNavigation(navController: NavHostController, modifier: Modifier = Modifier) {
    NavHost(navController = navController, startDestination = "bottom_screen1") {
        composable("bottom_screen1") { BottomScreen1(navController) }
        composable("bottom_screen2") { BottomScreen2(navController) }
        composable("screen1") { Screen1(navController) }
        composable("screen2") { Screen2(navController) }
        composable("screen3") { Screen3(navController) }
        composable("screen4/{data}", arguments = listOf(navArgument("data") { type = NavType.StringType })) { backStackEntry ->
            Screen4(navController, backStackEntry.arguments?.getString("data") ?: "")
        }
    }
}

val bottomNavigationItems = listOf(
    NavigationItem("bottom_screen1", "Screen 1", Icons.Filled.Home), NavigationItem("bottom_screen2", "Screen 2", Icons.Filled.Settings)
)

val bottomBarRoutes = setOf("bottom_screen1", "bottom_screen2")