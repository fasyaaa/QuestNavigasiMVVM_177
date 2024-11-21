package com.example.mvvmmodel.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.mvvmmodel.model.Mahasiswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class MahasiswaViewModel : ViewModel() {
//    Only access internal class
    private val _dataModel = MutableStateFlow(Mahasiswa())

//    accesss for public
    val dataModel: StateFlow<Mahasiswa> = _dataModel.asStateFlow()

//    function untuk menyimpan datanya
    fun saveDataMhs(
        listData : MutableList<String>
    ){
        _dataModel.update { mhs ->
            mhs.copy(
                nim = listData[0],
                nama = listData[1],
                gender = listData[2],
                alamat = listData[3],
                email = listData[4],
                notelp =  listData[5]
            )
        }
    }
}