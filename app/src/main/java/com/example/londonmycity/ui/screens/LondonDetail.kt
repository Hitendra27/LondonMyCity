package com.example.londonmycity.ui.screens

import android.content.res.Configuration
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.londonmycity.R
import com.example.londonmycity.data.LocalCategoryDataProvider
import com.example.londonmycity.model.LondonAttraction
import com.example.londonmycity.ui.theme.LondonMyCityTheme

@Composable
fun LondonDetail(
    selectedAttraction: LondonAttraction,
    onBackButtonClick: () -> Unit = {},
    contentPadding: PaddingValues = PaddingValues(0.dp),
    modifier: Modifier = Modifier
) {
    BackHandler {
        onBackButtonClick()
    }
    val scrollState = rememberScrollState()
    val layoutDirection = LocalLayoutDirection.current

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .background(Color.Black)
            .padding(contentPadding)
            .verticalScroll(scrollState)
    ) {
        Image(
            painter = painterResource(id = selectedAttraction.imageResourceId),
            contentDescription = null,
            alignment = Alignment.TopCenter,
            contentScale = ContentScale.FillWidth,
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(16f / 9f)
        )
        Text(
            text = stringResource(id = selectedAttraction.titleResourceId),
            textAlign = TextAlign.Center,
            color = Color(0xFFFFBB00),
            style = MaterialTheme.typography.displayLarge,
            modifier = Modifier.padding(
                vertical = dimensionResource(R.dimen.padding_detail_content_vertical),
                horizontal = dimensionResource(R.dimen.padding_detail_content_horizontal)
            )
        )

        Text(
            text = stringResource(id = selectedAttraction.details),
            textAlign = TextAlign.Justify,
            color = Color(0xFF7094D4),
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(
                vertical = dimensionResource(R.dimen.padding_detail_content_vertical),
                horizontal = dimensionResource(R.dimen.padding_detail_content_horizontal)
            )
        )
    }

}

@Preview(showBackground = true)
@Composable
fun LondonDetailPreview() {
    LondonMyCityTheme {
        Surface {
            LondonDetail(
                selectedAttraction = LocalCategoryDataProvider.defaultCategory.attraction[4],
                onBackButtonClick = {},
                contentPadding = PaddingValues(0.dp)
            )

        }

    }
}
