package com.yourbirtdaycard.birthdaycard4

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yourbirtdaycard.birthdaycard4.ui.theme.BirthdayCard4Theme


@Composable
fun BirthdayGreetingWithBackgroundImage(modifier: Modifier = Modifier) {
    Box(modifier = modifier.fillMaxSize()) {

        Image(
            painter = painterResource(id = R.drawable.androidparty),
            contentDescription = "Background Image",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        GreetingTextLayout(
            mainGreeting = stringResource(R.string.happy_birthday_recipient),
            fromMessage = stringResource(R.string.birthday_sender_name)
        )
    }
}
@Composable
fun GreetingTextLayout(mainGreeting: String, fromMessage: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(
                top = 80.dp,
                bottom = 60.dp,
                start = 24.dp,
                end = 24.dp
            ),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = mainGreeting, //
            fontSize = 50.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF333333),
            textAlign = TextAlign.Center,
            fontFamily = FontFamily.SansSerif,
            lineHeight = 58.sp
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = fromMessage, //
            fontSize = 24.sp,
            fontWeight = FontWeight.Normal,
            color = Color(0xFF404040),
            textAlign = TextAlign.Center,
            fontFamily = FontFamily.SansSerif
        )
    }
}


@Preview(showBackground = true, showSystemUi = true, name = "Birthday Card Preview")
@Composable
fun BirthdayGreetingPreview() {
    BirthdayCard4Theme {
        BirthdayGreetingWithBackgroundImage()
    }
}