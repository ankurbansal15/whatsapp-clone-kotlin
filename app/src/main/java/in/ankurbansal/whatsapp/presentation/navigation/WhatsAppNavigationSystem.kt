package `in`.ankurbansal.whatsapp.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import `in`.ankurbansal.whatsapp.presentation.callscreen.CallScreen
import `in`.ankurbansal.whatsapp.presentation.communitiesscreen.CommunitiesScreen
import `in`.ankurbansal.whatsapp.presentation.homescreen.HomeScreen
import `in`.ankurbansal.whatsapp.presentation.profile.UserProfileSetScreen
import `in`.ankurbansal.whatsapp.presentation.splashscreen.SplashScreen
import `in`.ankurbansal.whatsapp.presentation.updatescreen.UpdateScreen
import `in`.ankurbansal.whatsapp.presentation.userregisterationscreen.AuthScreen
import `in`.ankurbansal.whatsapp.presentation.userregisterationscreen.UserRegistrationScreen
import `in`.ankurbansal.whatsapp.presentation.viewmodels.AuthState
import `in`.ankurbansal.whatsapp.presentation.welcomescreen.WelcomeScreen

@Composable
fun WhatsAppNavigationSystem() {
    val navController = rememberNavController()

    NavHost(startDestination = Routes.SplashScreen, navController = navController){
        composable<Routes.SplashScreen> {
            SplashScreen(navController)
        }
        composable<Routes.WelcomeScreen> {
            WelcomeScreen(navController)
        }
        composable<Routes.UserRegistrationScreen> {
            AuthScreen(navController)
        }
        composable<Routes.UpdateScreen> {
            UpdateScreen()
        }
        composable<Routes.HomeScreen> {
            HomeScreen()
        }
        composable<Routes.CommunitiesScreen> {
            CommunitiesScreen()
        }
        composable<Routes.CallScreen> {
            CallScreen()
        }
        composable<Routes.UserProfileSetScreen> {
            UserProfileSetScreen(navHostController = navController)
        }
    }
}