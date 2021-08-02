package com.mfahmi.mythirdcomposeapp.ui.aboutme

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.mfahmi.mythirdcomposeapp.R
import com.mfahmi.mythirdcomposeapp.ui.theme.*

@Composable
fun AboutMeScreen(navController: NavController) {
    AboutMeDesign()
}

@Composable
fun AboutMeDesign() {
    MyThirdComposeAppTheme {
        Column(Modifier.padding(DimenStandard)) {
            Card(
                shape = RoundedCornerShape(DimenStandard),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = DimenStandard),
                backgroundColor = SurfaceDarkColor
            ) {
                Column(Modifier.padding(DimenStandard)) {
                    Text(text = "Introduction", color = Color.White, fontSize = 18.sp)
                    Spacer(Modifier.height(DimenSmall))
                    Text(
                        text = "Just little bit of introduction, I'm an Informatics student " +
                                "at the Institute Technology of Kalimantan, interested in Android " +
                                "Development, NLP, and Web Development.",
                        color = GreyColor,
                        fontSize = 14.sp
                    )
                }
            }
            Spacer(Modifier.height(DimenStandard))
            Text(text = "Language and Tools", color = Color.White, fontSize = 18.sp)
            Spacer(Modifier.height(DimenStandard))
            Row(Modifier.fillMaxWidth()) {
                CardLangAndTools(cardIcon = R.drawable.ic_kotlin, cardName = "Kotlin")
                Spacer(modifier = Modifier.width(DimenStandard))
                CardLangAndTools(cardIcon = R.drawable.ic_python, cardName = "Python")
                Spacer(modifier = Modifier.width(DimenStandard))
                CardLangAndTools(cardIcon = R.drawable.ic_git, cardName = "Git")
            }
        }
    }
}

@Composable
fun CardLangAndTools(@DrawableRes cardIcon: Int, cardName: String) {
    Card(
        shape = RoundedCornerShape(DimenStandard),
        modifier = Modifier.wrapContentSize()
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier
                .size(105.dp)
                .padding(DimenSmall)
        ) {
            Image(
                painter = painterResource(id = cardIcon),
                contentDescription = "Card About",
                modifier = Modifier.padding(DimenStandard)
            )
            Spacer(Modifier.padding(DimenSuperSmall))
            Text(
                text = cardName,
                fontSize = 12.sp,
                color = Color.White
            )
        }
    }
}

@Preview
@Composable
fun AboutMePreview() {
    AboutMeDesign()
}