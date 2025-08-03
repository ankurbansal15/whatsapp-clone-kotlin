package `in`.ankurbansal.whatsapp.presentation.callscreen

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import `in`.ankurbansal.whatsapp.R

@Composable
@Preview(showSystemUi = true)
fun FavoritesSection() {
    val sampleFavorite = listOf(
        FavoriteContact(image = R.drawable.akshay_kumar, name = "Akshay Kumar"),
        FavoriteContact(image = R.drawable.mrbeast, name = "Mr Beast"),
        FavoriteContact(image = R.drawable.rashmika, name = "Rashmika"),
        FavoriteContact(image = R.drawable.sharukh_khan, name = "Sharukh Khan"),
        FavoriteContact(image = R.drawable.disha_patani, name = "Disha Patani"),

        )
    Column(modifier = Modifier.padding(start = 16.dp, bottom = 8.dp)) {
        Text(
            text = "Favorites",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(8.dp)
        )
        Row(modifier = Modifier
            .fillMaxWidth()
            .horizontalScroll(rememberScrollState())) {

            sampleFavorite.forEach { data->
                FavoritesItem(data)
            }

        }

    }
}