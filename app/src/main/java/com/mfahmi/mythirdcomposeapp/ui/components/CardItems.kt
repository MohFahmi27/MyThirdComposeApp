package com.mfahmi.mythirdcomposeapp.ui.components

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
import com.mfahmi.mythirdcomposeapp.R
import com.mfahmi.mythirdcomposeapp.ui.theme.*

@Composable
fun CardItems(@DrawableRes cardIcon: Int, title: String, subTitle: String) {
    Card(
        shape = RoundedCornerShape(DimenStandard),
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = DimenSmall, vertical = DimenStandard),
        backgroundColor = SurfaceDarkColor
    ) {
        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(
            DimenSuperSmall)) {
            Image(
                painter = painterResource(id = cardIcon),
                contentDescription = "Card Icon",
                modifier = Modifier
                    .padding(DimenStandard)
                    .padding(DimenSmall)
                    .size(50.dp)
            )
            Column {
                Text(
                    text = title,
                    color = Color.White
                )
                Text(
                    text = subTitle,
                    color = GreyColor,
                    fontSize = 12.sp
                )
            }
        }
    }
}

@Preview
@Composable
fun CardItemsPreview() {
    MyThirdComposeAppTheme {
        CardItems(R.drawable.ic_education, "Institut Teknologi Kalimantan", "2018 - 2023")
    }
}