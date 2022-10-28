package com.example.learntogether

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learntogether.ui.theme.LearnTogetherTheme
// add a coment
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnTogetherTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    TutorialImage()
                }
            }
        }
    }
}

@Composable
fun JetpackCompose() {

    Column {
        Text(
            text = "Jetpack Compose tutorial",
            fontSize = 24.sp,
            modifier = Modifier
                .background(color = Color.Cyan)
                .wrapContentWidth(Alignment.CenterHorizontally)
                .fillMaxWidth()
                .padding(start = 16.dp, top = 16.dp, bottom = 16.dp, end = 16.dp),
        )
        Text(
            text =  stringResource(R.string.AboutJetPackCompose1),
            modifier = Modifier
                .wrapContentWidth(Alignment.CenterHorizontally)
                .fillMaxWidth()
                .padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = stringResource(R.string.AboutJetpackCompose2),
            modifier = Modifier
                .wrapContentWidth(Alignment.CenterHorizontally)
                .fillMaxWidth()
                .padding(start = 16.dp, top = 16.dp, bottom = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify
        )
    }

}

@Composable
fun TutorialImage() {
    val image = painterResource(id = R.drawable.bg_compose_background)
    Column {
        Image(
            painter = image,
            contentDescription = null,


            modifier = Modifier
                .fillMaxWidth()

        )
        JetpackCompose()
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LearnTogetherTheme {
        TutorialImage()
    }
}