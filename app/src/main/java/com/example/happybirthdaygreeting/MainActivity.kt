package com.example.happybirthdaygreeting

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthdaygreeting.ui.theme.HappyBirthdayGreetingTheme





class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayGreetingTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BirthdayGreetingImage(getString(R.string.Happy_Birthday_Amaan),getString(R.string.signature_text))
                }
            }
        }
    }
}

@Composable
fun BirthdayGreetingText(message:String,from:String){

    Column{
        Text(
            text = message,
            fontSize = 35.sp,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.CenterHorizontally)
                .padding(start = 20.dp, top = 270.dp)



        )

        Text(
            text = from,
            fontSize = 24.sp,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.CenterHorizontally)
                .padding(start = 50.dp, top= 16.dp)
        )
    }

}

@Composable
fun BirthdayGreetingImage(message:String,from:String) {
    val image = painterResource(R.drawable.pngtreevector_cartoon_birthday_card_1946093)
    Box {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(),
            contentScale = ContentScale.Crop
        )
        BirthdayGreetingText(message = message, from = from )
    }
}




@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    HappyBirthdayGreetingTheme {
        BirthdayGreetingImage("Happy Birthday Amaan","- from Anonymous")

    }
}