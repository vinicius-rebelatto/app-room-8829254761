package br.edu.up.rgm8829254761.ui.home

import androidx.lifecycle.ViewModel
import br.edu.up.rgm8829254761.data.Item

/**
 * ViewModel to retrieve all items in the Room database.
 */
class HomeViewModel : ViewModel() {
    companion object {
        private const val TIMEOUT_MILLIS = 5_000L
    }
}

/**
 * Ui State for HomeScreen
 */
data class HomeUiState(val itemList: List<Item> = listOf())
