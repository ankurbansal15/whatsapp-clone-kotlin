package `in`.ankurbansal.whatsapp.presentation.updatescreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import `in`.ankurbansal.whatsapp.R
import `in`.ankurbansal.whatsapp.presentation.bottomnavigation.BottomNavigation
import kotlinx.coroutines.channels.Channel

@Composable
@Preview(showSystemUi = true)
fun UpdateScreen() {

    val scrollState = rememberScrollState()

    val sampleData = listOf(
        StatusData(
            image = R.drawable.disha_patani,
            name = "Disha Patani",
            time = "10 min ago"
        ),
        StatusData(
            image = R.drawable.sharukh_khan,
            name = "Sharukh Khan",
            time = "20 min ago"
        ),
        StatusData(
            image = R.drawable.rashmika,
            name = "Rashmika",
            time = "30 min ago"
        ),
        StatusData(
            image = R.drawable.sharadha_kapoor,
            name = "Sharadha Kapoor",
            time = "40 min ago"
        ),
        StatusData(
            image = R.drawable.akshay_kumar,
            name = "Akashay Kumar",
            time = "50 min ago"
        )
    )

    val channelsData = listOf(
        Channels(image = R.drawable.neat_roots, name = "Neet Roots", description = "Latest news in tech"),
        Channels(image = R.drawable.img, name = "Food Lover", description = "Discover new recipes"),
        Channels(image = R.drawable.meta, name = "Meta", description = "Explore the world")
    )

    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                onClick = {},
                containerColor = colorResource(id = R.color.light_green),
                modifier = Modifier.size(65.dp),
                contentColor = Color.White
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.baseline_photo_camera_24),
                    contentDescription = null
                )
            }
        },
        bottomBar = {
            BottomNavigation()
        },
        topBar = {
            TopBar()
        }
    ) {
        Column(
            modifier = Modifier
                .padding(it)
                .fillMaxSize()
                .verticalScroll(scrollState)
        ) {
            Text(
                text = "Status",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                modifier = Modifier
                    .padding(12.dp, vertical = 8.dp)
            )
            MyStatus()
            sampleData.forEach { data ->
                StatusItem(statusData = data)
            }
            Spacer(modifier = Modifier.height(16.dp))
            HorizontalDivider(
                color = Color.Gray
            )
            Text(
                text = "Channels",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp)
            )
            Spacer(modifier = Modifier.height(8.dp))
            Column(modifier = Modifier.padding(horizontal = 16.dp)){
                Text(text = "stay updated on topics that matter to you. Find channels to follow below")
                Spacer(modifier = Modifier.height(32.dp))
                Text(text = "Find channels to follow")
            }
            Spacer(modifier = Modifier.height(16.dp))
            channelsData.forEach { data->
                ChannelItemDesign(channels = data)
            }
        }
    }
}