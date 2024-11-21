package com.example.mvvmmodel.ui.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.mvvmmodel.model.Mahasiswa

@Composable
fun DetailMahasiswaView(
    dataMhs: Mahasiswa,
    modifier: Modifier = Modifier,
    onBackClick: () -> Unit = {}
){
    val listDataMahasiswa = listOf(
        Pair("Nama", dataMhs.nama),
        Pair("Gender", dataMhs.gender),
        Pair("Alamat", dataMhs.alamat),
        Pair("Email", dataMhs.email),
        Pair("No Telephone", dataMhs.notelp)
    )

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        listDataMahasiswa.forEach{data ->
            DetailMhs(judul = data.first,
                Isinya = data.second)
        }
    }
}


@Composable
// untuk memanggil di elevated card
fun DetailMhs(
    judul: String, Isinya: String
){
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
    ){
        Text(text = judul,
            modifier = Modifier.weight(0.8f))
        Text(text = " : ",
            modifier = Modifier.weight(0.2f))
        Text(text = Isinya,
            modifier = Modifier.weight(2f))
    }
}