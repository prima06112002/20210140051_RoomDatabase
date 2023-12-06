package com.example.persistencedata.model

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import com.example.persistencedata.AplikasiSiswa

/**
 * Fungsi ekstensi query untuk object [Application] dan mengembalikan sebuah instance dari [AplikasiSiswa]
 */
fun CreationExtras.aplikasiSiswa(): AplikasiSiswa =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as AplikasiSiswa)