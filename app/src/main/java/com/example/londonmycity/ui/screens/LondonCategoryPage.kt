package com.example.londonmycity.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.londonmycity.R
import com.example.londonmycity.data.LocalCategoryDataProvider
import com.example.londonmycity.model.LondonCategory
import com.example.londonmycity.ui.theme.LondonMyCityTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LondonCategoryPage(
    londonCategory: LondonCategory,
    onItemClick: (LondonCategory) -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        elevation = CardDefaults.cardElevation(),
        modifier = modifier,
        shape = RoundedCornerShape(dimensionResource(R.dimen.card_corner_radius)),
        onClick = { onItemClick(londonCategory) }
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .size(dimensionResource(R.dimen.card_image_height)),
            verticalAlignment = Alignment.CenterVertically
        ) {
            LondonCategoryListItem(
                londonCategory = londonCategory,
                modifier = Modifier
                    .size(dimensionResource(R.dimen.card_image_height))
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
                    text = stringResource(londonCategory.title),
                    style = MaterialTheme.typography.displayMedium,
                   // color =
                    modifier = Modifier.padding(bottom = dimensionResource(R.dimen.card_text_vertical_space))
                )
                //Spacer(Modifier.weight(1f))
                Text(
                    text = stringResource(londonCategory.subtitle),
                    style = MaterialTheme.typography.labelSmall,
                    // color
                    overflow = TextOverflow.Ellipsis,
                    minLines = 3
                )
            }
        }
    }
}

@Composable
fun LondonCategoryList(
    londonCategories: List<LondonCategory>,
    onClick: (LondonCategory) -> Unit,
    modifier: Modifier = Modifier,
    contentPadding: PaddingValues = PaddingValues(0.dp)
) {
    LazyColumn(
        contentPadding = contentPadding,
        verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.padding_medium)),
        modifier = modifier,
    ) {
        items(londonCategories, key = {  londonCategory -> londonCategory.id }) { londonCategory ->
            LondonCategoryPage(
                londonCategory = londonCategory,
                onItemClick = onClick
            )
        }
    }
}

@Composable
fun LondonCategoryListItem(
    londonCategory: LondonCategory,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
    ) {
        Image(
            painter = painterResource(londonCategory.imageResourceId),
            contentDescription = null,
            alignment = Alignment.Center,
            contentScale = ContentScale.Crop
        )
    }
}

@Preview
@Composable
fun LondonCategoryListPreview() {
    LondonMyCityTheme {
        Surface {
            LondonCategoryList(
                londonCategories = LocalCategoryDataProvider.getCategoryData(),
                onClick = {}

            )
        }
    }
}

@Preview
@Composable
fun LondonCategoryListItemPreview() {
    LondonMyCityTheme {
        Surface {
            LondonCategoryListItem(
                londonCategory = LocalCategoryDataProvider.defaultCategory,
                modifier = Modifier.padding(dimensionResource(R.dimen.padding_small))
            )
        }
    }
}

@Preview
@Composable
fun LondonCategoryPagePreview() {
    LondonMyCityTheme {
        Surface {
            LondonCategoryPage(
                londonCategory = LocalCategoryDataProvider.defaultCategory,
                onItemClick = {},
                modifier = Modifier.padding(dimensionResource(R.dimen.padding_small))
            )
        }
    }
}

