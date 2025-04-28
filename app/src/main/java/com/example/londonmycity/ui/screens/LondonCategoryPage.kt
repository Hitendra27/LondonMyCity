package com.example.londonmycity.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.londonmycity.R
import com.example.londonmycity.model.LondonCategory
import com.example.londonmycity.ui.theme.LondonMyCityTheme

@Composable
fun LondonCategoryPage(
    contentPadding: PaddingValues = PaddingValues(0.dp)
) {
}

//@Composable
//private fun LondonCategoryList(
//    londonCategories: List<LondonCategory>,
//    onClick: (LondonCategory) -> Unit,
//    modifier: Modifier = Modifier,
//    contentPadding: PaddingValues = PaddingValues(0.dp)
//) {
//    LazyColumn(
//        contentPadding = contentPadding,
//        verticalArrangement = Arrangement.SpaceBy(dimensionResource(R.dimen.padding_medium)),
//        modifier = modifier,
//    ) {
//        items(londonCategories, key = { })
//    }
//}

@Composable
private fun LondonCategoryListItem(
    londonCategory: LondonCategory,
    modifier: Modifier
) {
    Box(
        modifier = Modifier
    ) {
        Image(
            painter = painterResource(londonCategory.imageResourceId),
            contentDescription = null,
            alignment = Alignment.Center,
            contentScale = ContentScale.FillWidth
        )
    }

}

@Preview
@Composable
fun LondonCategoryPagePreview() {
    LondonMyCityTheme {
        Surface{

        }
    }
}