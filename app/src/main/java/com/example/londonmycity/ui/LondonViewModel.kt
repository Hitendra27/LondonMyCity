package com.example.londonmycity.ui

import androidx.lifecycle.ViewModel
import com.example.londonmycity.data.LocalCategoryDataProvider
import com.example.londonmycity.model.LondonAttraction
import com.example.londonmycity.model.LondonCategory
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update

class LondonViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(
        LondonUiState(
            londonCategoryList = LocalCategoryDataProvider.getCategoryData(),
            currentCategory = LocalCategoryDataProvider.getCategoryData().getOrElse(0){
                LocalCategoryDataProvider.defaultCategory
            },
            currentAttractionList = LocalCategoryDataProvider.getCategoryData().getOrElse(0) {
                LocalCategoryDataProvider.defaultCategory
            }.attraction
        )
    )

    val uiState: StateFlow<LondonUiState> = _uiState

    fun updateCurrentCategory(selectedCategory: LondonCategory) {
        _uiState.update {
            it.copy(
                currentCategory = selectedCategory,
                currentAttractionList = selectedCategory.attraction
            )
        }
    }

    fun navigateToAttractionPage() {
        _uiState.update {
            it.copy(isShowingListPage = false)
        }
    }

    fun navigateToListPage() {
        _uiState.update {
            it.copy(isShowingListPage = true)
        }
    }
}

data class LondonUiState(
    val londonCategoryList: List<LondonCategory> = emptyList(),
    val currentCategory: LondonCategory = LocalCategoryDataProvider.defaultCategory,
    val currentAttractionList: List<LondonAttraction> = emptyList(),
    val isShowingListPage: Boolean = true
)