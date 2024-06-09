import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.KoinContext

@Composable
@Preview
fun App() {
    MaterialTheme {
        KoinContext {
            val controller = rememberNavController()

            NavHost(
                navController = controller,
                startDestination = "ScreenA"
            ) {
                composable(
                    route = "ScreenA"
                ) {
                    ScreenA()
                }
            }
        }
    }
}