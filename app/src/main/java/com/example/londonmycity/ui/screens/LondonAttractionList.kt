package com.example.londonmycity.ui.screens

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.londonmycity.R
import com.example.londonmycity.data.LocalCategoryDataProvider
import com.example.londonmycity.model.LondonAttraction
import com.example.londonmycity.ui.theme.LondonMyCityTheme

@Composable
fun LondonAttractionList(
    londonAttractions: List<LondonAttraction>,
    onItemClick: (LondonAttraction) -> Unit,
    modifier: Modifier = Modifier,
    contentPadding: PaddingValues = PaddingValues(0.dp),
) {
    LazyColumn(
        contentPadding = contentPadding,
        verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.padding_medium)),
        modifier = modifier
            .fillMaxSize()
    ) {
        items(londonAttractions) { attraction ->
            ListItem(
                title = stringResource(id = attraction.titleResourceId),
                subtitle = stringResource(id = attraction.subtitleResourceId),
                image = attraction.imageResourceId,
                onClick = { onItemClick(attraction) },
                modifier = modifier
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ListItem(
    title: String,
    subtitle: String,
    @DrawableRes image: Int,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        elevation = CardDefaults.cardElevation(),
        shape = RoundedCornerShape(dimensionResource(R.dimen.card_corner_radius)),
        onClick = onClick,
        modifier = modifier
            .fillMaxWidth()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .size(dimensionResource(R.dimen.card_image_height)),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = image),
                contentDescription = null,
                modifier = Modifier
                    .size(dimensionResource(R.dimen.card_image_height)),
                contentScale = ContentScale.Crop,
                alignment = Alignment.Center
            )
            Column(
                modifier = Modifier
                    .padding(
                        vertical = dimensionResource(R.dimen.padding_small),
                        horizontal = dimensionResource(R.dimen.padding_medium)
                    )
                .weight(1f)

                ) {
                Text(
                    text = title,
                    style = MaterialTheme.typography.displayMedium,
                    color = Color(0xFFFFBB00),
                    modifier = Modifier.padding(bottom = dimensionResource(R.dimen.padding_small)),
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
                Text(
                    text = subtitle,
                    style = MaterialTheme.typography.labelSmall,
                    color = Color(0xFF7094D4),
                    maxLines = 3,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }
    }
}

@Preview
@Composable
fun ListItemPreview() {
    LondonMyCityTheme {
        Surface {
            ListItem(
                title = "Title",
                subtitle = "Subtitle",
                image = R.drawable.emirates,
                onClick = {}
            )
        }
    }
}

@Preview("List item")
@Composable
fun LondonAttractionListPreview() {
    LondonMyCityTheme {
        Surface {
            LondonAttractionList(
                londonAttractions = LocalCategoryDataProvider.getCategoryData()[0].attraction,
                onItemClick = {},
            )
        }
    }
}