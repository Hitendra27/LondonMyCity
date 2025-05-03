package com.example.londonmycity.ui

import androidx.lifecycle.ViewModel
import com.example.londonmycity.data.LocalCategoryDataProvider
import com.example.londonmycity.model.LondonAttraction
import com.example.londonmycity.model.LondonCategory
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlin.collections.get

class LondonViewModel() : ViewModel() {
    private val _uiState = MutableStateFlow(LondonUiState())
    val uiState: StateFlow<LondonUiState> = _uiState.asStateFlow()

    init {
        initializeUi()
    }

    private fun initializeUi() {
        val data = LocalCategoryDataProvider.getCategoryData()
        _uiState.update { currentState ->
            currentState.copy(
                londonCategoryList = data,
                currentCategory = data[0]
            )
        }
    }

    fun navigateToListPage() {
        _uiState.update { currentState ->
            currentState.copy(
                isShowingListPage = true,
                isShowingDetailPage = false,
                currentCategory = currentState.londonCategoryList[0],
                selectedAttraction = null
            )
        }
    }

    fun navigateToAttractionList(){
        _uiState.update { currentState ->
            currentState.copy(
                isShowingListPage = false,
                isShowingDetailPage = false,
                selectedAttraction = null
            )
        }
    }

    fun navigateToAttractionPage() {
        _uiState.update { currentState ->
            currentState.copy(
                isShowingListPage = false,
            )
        }
    }

    fun updateCurrentCategory(londonCategory: LondonCategory) {
        _uiState.update { currentState ->
            currentState.copy(
                currentCategory = londonCategory
            )
        }
    }

    fun navigateToDetailPage(selectedAttraction: LondonAttraction) {
        _uiState.update { currentState ->
            currentState.copy(
                isShowingDetailPage = true,
                selectedAttraction = selectedAttraction
            )
        }
    }
}

data class LondonUiState(
    val londonCategoryList: List<LondonCategory> = emptyList(),
    val currentCategory: LondonCategory = LocalCategoryDataProvider.defaultCategory,
    val currentAttractionList: List<LondonAttraction> = emptyList(),
    val isShowingListPage: Boolean = true,
    val isShowingDetailPage: Boolean = false,
    val selectedAttraction: LondonAttraction? = null
)