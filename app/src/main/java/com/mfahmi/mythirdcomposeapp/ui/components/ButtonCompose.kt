package com.mfahmi.mythirdcomposeapp.ui.components

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.mfahmi.mythirdcomposeapp.ui.theme.DimenSmall
import com.mfahmi.mythirdcomposeapp.ui.theme.DimenStandard

@Composable
fun ButtonCompose(
    @DrawableRes buttonIcon: Int,
    @StringRes buttonText: Int,
    navController: NavController,
    destination: String
) {
    Button(
        onClick = { navController.navigate(destination) },
        shape = RoundedCornerShape(DimenStandard),
        modifier = Modifier.wrapContentSize()
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier
                .padding(DimenSmall)
        ) {
            Image(
                painter = painterResource(id = buttonIcon),
                contentDescription = stringResource(id = buttonText),
                modifier = Modifier.padding(top = DimenSmall)
            )
            Spacer(Modifier.padding(DimenSmall))
            Text(
                text = stringResource(id = buttonText),
                fontSize = 12.sp,
                color = Color.White
            )
        }
    }
}