package com.mfahmi.mythirdcomposeapp.ui.education

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.mfahmi.mythirdcomposeapp.R
import com.mfahmi.mythirdcomposeapp.ui.components.CardItems
import com.mfahmi.mythirdcomposeapp.ui.theme.MyThirdComposeAppTheme

@Composable
fun EducationScreen(navController: NavController) {
    EducationDesign()
}

@Composable
fun EducationDesign() {
    MyThirdComposeAppTheme {
        Column {
            CardItems(
                cardIcon = R.drawable.ic_education,
                title = "Institute Technology of Kalimantan",
                subTitle = "2018 - 2023  |  Institute"
            )
            CardItems(
                cardIcon = R.drawable.ic_education,
                title = "SMKN 7 Samarinda",
                subTitle = "2015 - 2018  |  School"
            )
        }
    }
}

@Preview
@Composable
fun EducationPreview() {
    EducationDesign()
}