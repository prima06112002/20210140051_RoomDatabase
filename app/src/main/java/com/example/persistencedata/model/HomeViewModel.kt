package com.example.persistencedata.model

import androidx.lifecycle.ViewModel
import com.example.persistencedata.data.Siswa
import com.example.persistencedata.repos.RepositorySiswa

class HomeViewModel(private val repositoriSiswa: RepositorySiswa) : ViewModel() {
    companion object {
        private const val TIMEOUT_MILLIS = 5_000L
    }
    data class HomeUiState(
        val listSiswa: List<Siswa> = listOf()
    )
}
