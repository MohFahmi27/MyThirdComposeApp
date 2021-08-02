package com.mfahmi.mythirdcomposeapp.ui.experience

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.mfahmi.mythirdcomposeapp.R
import com.mfahmi.mythirdcomposeapp.ui.components.CardItems
import com.mfahmi.mythirdcomposeapp.ui.theme.MyThirdComposeAppTheme

@Composable
fun ExperienceScreen(navController: NavController) {
    ExperienceDesign()
}

@Composable
fun ExperienceDesign() {
    MyThirdComposeAppTheme {
        MyThirdComposeAppTheme {
            Column {
                CardItems(
                    cardIcon = R.drawable.ic_experience,
                    title = "DSC ITK",
                    subTitle = "Aug 2020 - Aug 2021 | Organization"
                )
                CardItems(
                    cardIcon = R.drawable.ic_experience,
                    title = "Bangkit Academy",
                    subTitle = "Feb 2021 - Jul 2021 | Mobile Path"
                )
            }
        }
    }
}

@Preview
@Composable
fun ExperiencePreview() {
    ExperienceDesign()
}