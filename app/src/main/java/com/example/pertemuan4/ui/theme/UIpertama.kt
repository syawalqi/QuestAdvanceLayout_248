package com.example.pertemuan4.ui.theme

import com.example.pertemuan4.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column

@Composable
fun ActivitasPertama(modifier: Modifier){
    Column(modifier = Modifier.padding(top = 100.dp)
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(id = R.string.prodi),
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = stringResource(id = R.string.univ),
            fontSize = 22.sp
        )

    }
}
