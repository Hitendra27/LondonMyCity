package com.example.londonmycity.ui

import android.graphics.drawable.Icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.londonmycity.R
import com.example.londonmycity.data.LocalCategoryDataProvider
import com.example.londonmycity.ui.screens.LondonAttractionList
import com.example.londonmycity.ui.screens.LondonCategoryList
import com.example.londonmycity.ui.theme.LondonMyCityTheme


@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun LondonApp() {
    val viewModel: LondonViewModel = viewModel()
    val uiState by viewModel.uiState.collectAsState()

    val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior()
    Scaffold(
        topBar = { LondonTopAppBar(
            isShowingListPage = uiState.isShowingListPage,
            onBackButtonClick = { viewModel.navigateToListPage() }
        ) },

        ) { innerPadding ->
        if (uiState.isShowingListPage) {
            LondonCategoryList(
                londonCategories = uiState.londonCategoryList,
                onClick = {
                    viewModel.updateCurrentCategory(it)
                    viewModel.navigateToAttractionPage()
                },
                contentPadding = innerPadding,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        top = dimensionResource(R.dimen.padding_medium),
                        start = dimensionResource(R.dimen.padding_medium),
                        end = dimensionResource(R.dimen.padding_medium)
                    )
            )
        } else {
            LondonAttractionList(
                londonAttractions = uiState.currentCategory.attraction,
                contentPadding = innerPadding,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        top = dimensionResource(R.dimen.padding_medium),
                        start = dimensionResource(R.dimen.padding_medium),
                        end = dimensionResource(R.dimen.padding_medium)
                    )
            )

        }
    }
    }


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LondonTopAppBar(
    onBackButtonClick: () -> Unit = {},
    isShowingListPage: Boolean = true,
    modifier: Modifier = Modifier,
) {
    CenterAlignedTopAppBar(
        title = {
            if (isShowingListPage) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        modifier = Modifier
                            .size(84.dp)
                            .padding(4.dp),
                        painter = painterResource(R.drawable.app_top_bar2),
                        contentDescription = null
                    )
                    Text(
                        text = stringResource(R.string.app_top_bar),
                        style = MaterialTheme.typography.displayLarge
                    )
                }
            } else {
                Text(
                    text = "London Attractions",
                    style = MaterialTheme.typography.displayMedium,
                    textAlign = TextAlign.Start,

                )
            }
        },
        navigationIcon = {
            if (!isShowingListPage) {
                IconButton(onClick = onBackButtonClick) {
                        Icon(
                            imageVector = Icons.Filled.ArrowBack,
                            contentDescription = "back"
                        )

                  }
                }
        },
        modifier = modifier

    )
}


@Preview
@Composable
fun LondonAppPreview() {
    LondonMyCityTheme {
        Surface {
            LondonCategoryList(
                londonCategories = LocalCategoryDataProvider.getCategoryData(),
                onClick = {}

            )
        }
    }
    }
