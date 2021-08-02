package com.mfahmi.mythirdcomposeapp

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.mfahmi.mythirdcomposeapp.ui.components.ButtonCompose
import com.mfahmi.mythirdcomposeapp.ui.navigation.MainNavigation
import com.mfahmi.mythirdcomposeapp.ui.navigation.NavigationRoute
import com.mfahmi.mythirdcomposeapp.ui.theme.DimenLarge
import com.mfahmi.mythirdcomposeapp.ui.theme.DimenStandard
import com.mfahmi.mythirdcomposeapp.ui.theme.DimenSuperSmall
import com.mfahmi.mythirdcomposeapp.ui.theme.MyThirdComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyThirdComposeAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    MyMainActivity()
                }
            }
        }
    }
}

@Composable
fun MyMainActivity() {
    Column(
        Modifier
            .padding(DimenStandard)
            .fillMaxSize()
    ) {
        TitleName()
        Spacer(Modifier.height(DimenLarge))
        val navController = rememberNavController()
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            ButtonCompose(
                R.drawable.ic_user,
                R.string.about_me,
                navController,
                NavigationRoute.AboutMe.route
            )
            Spacer(Modifier.padding(DimenSuperSmall))
            ButtonCompose(
                R.drawable.ic_experience,
                R.string.experience,
                navController,
                NavigationRoute.Experience.route
            )
            Spacer(Modifier.padding(DimenSuperSmall))
            ButtonCompose(
                R.drawable.ic_education,
                R.string.education,
                navController,
                NavigationRoute.Education.route
            )
        }
        Spacer(Modifier.height(DimenStandard))
        MainNavigation(navController = navController)
    }
}

@Composable
fun TitleName() {
    Text(
        text = stringResource(id = R.string.about_me),
        color = MaterialTheme.colors.onBackground,
        fontSize = 24.sp
    )
}

@Preview(showBackground = true, showSystemUi = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
fun DefaultPreview() {
    MyThirdComposeAppTheme {
        MyMainActivity()
    }
}