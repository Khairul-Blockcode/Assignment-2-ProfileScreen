package com.example.assignment_2_profilescreen

import androidx.compose.foundation.BorderStroke
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.compose.material3.OutlinedButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.Dimension


@Composable
fun ProfileScreen(
    profilePicPainter: Painter,
    name: String,
    location: String,
    imageList: List<Painter>
) {
    val comfortaa = FontFamily(Font(R.font.cb))
    val robotoBold = FontFamily(Font(R.font.rb))
    val nameStyle = TextStyle(
        fontFamily = comfortaa,
        fontSize = 36.sp,
        fontWeight = FontWeight.W400,
        lineHeight = 40.sp,
        letterSpacing = (-0.015).em,
        textAlign = TextAlign.Center,
        color = Color(0xFF000000),
    )
    val locationStyle = TextStyle(
        fontFamily = robotoBold,
        fontSize = 13.sp,
        fontWeight = FontWeight.W900,
        lineHeight = 15.sp,
        letterSpacing = 0.04.em,
        textAlign = TextAlign.Center,
        color = Color(0xFF000000)
    )
    Column {
        ConstraintLayout(
            modifier = Modifier
                .fillMaxSize(.56f)
                .background(Color.White)
        ) {

            val (pic, userName, userLocation, followButton, messageButton) = createRefs()

            // Profile Image of Jane
            Image(
                painter = profilePicPainter,
                contentDescription = null,
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.constrainAs(pic) {
                    width = Dimension.value(128.dp)
                    height = Dimension.value(128.dp)
                    top.linkTo(parent.top, 50.dp)
                    start.linkTo(parent.start, 124.dp)
                }
            )
            // User's Name
            Text(
                text = name,
                style = nameStyle,
                overflow = TextOverflow.Ellipsis,
                maxLines = 1,
                modifier = Modifier.constrainAs(userName) {
                    width = Dimension.value(92.dp)
                    height = Dimension.value(60.dp)
                    top.linkTo(parent.top, 180.dp)
                    start.linkTo(parent.start, 142.dp)
                }
            )
            // User's Location
            Text(
                text = location,
                style = locationStyle,
                modifier = Modifier.constrainAs(userLocation) {
                    width = Dimension.value(133.dp)
                    height = Dimension.value(15.dp)
                    top.linkTo(parent.top, 250.dp)
                    start.linkTo(parent.start, 128.dp)
                }
            )
            // Follow Button
            Button(
                onClick = { },
                modifier = Modifier.constrainAs(followButton) {
                    width = Dimension.value(343.dp)
                    height = Dimension.value(52.dp)
                    top.linkTo(parent.top, 280.dp)
                    start.linkTo(parent.start, 16.dp)
                }
                    .background(    color = Color(0xFF000000), shape = RoundedCornerShape(6.dp)),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Black)
            ) {
                Text(text = "FOLLOW JANE", color = Color.White, fontWeight = FontWeight.SemiBold)
            }
            // Message Button
            OutlinedButton(
                onClick = { },
                modifier = Modifier.constrainAs(messageButton) {
                    width = Dimension.value(343.dp)
                    height = Dimension.value(52.dp)
                    top.linkTo(parent.top, 350.dp)
                    start.linkTo(parent.start, 16.dp)
                },
                shape = RoundedCornerShape(8.dp),
                border = BorderStroke(width = 2.dp, color = Color.Black),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent)
            ) {
                Text(text = "MESSAGE", color = Color.Black, fontWeight = FontWeight.Bold)
            }
        }

        Spacer(modifier = Modifier.height(0.dp))
        LazyVerticalGrid(
            columns = GridCells.Fixed(3),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 3.dp)
        ) {
            items(imageList.size) { index ->
                Image(
                    painter = imageList[index],
                    contentScale = ContentScale.FillBounds,
                    contentDescription = null,
                    modifier = Modifier
                        .size(107.dp)
                        .padding(4.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true, widthDp = 375, heightDp = 812)
@Composable
fun ProfilePreview() {
    val imageList = listOf(
        painterResource(id = R.drawable.one),
        painterResource(id = R.drawable.two),
        painterResource(id = R.drawable.three),
        painterResource(id = R.drawable.four),
        painterResource(id = R.drawable.five),
        painterResource(id = R.drawable.six),
        painterResource(id = R.drawable.seven),
        painterResource(id = R.drawable.eight),
        painterResource(id = R.drawable.nine),
        painterResource(id = R.drawable.ten),
        painterResource(id = R.drawable.eleven),
        painterResource(id = R.drawable.twelve),
        painterResource(id = R.drawable.thirteen),
        painterResource(id = R.drawable.fourteen),
        painterResource(id = R.drawable.fifteen)
    )
    ProfileScreen( imageList= imageList,
        profilePicPainter = painterResource(id = R.drawable.jane),
        name = "Jane",
        location = "SAN FRANCISCO,CA",
    )
}

