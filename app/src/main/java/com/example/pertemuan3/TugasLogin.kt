package com.example.pertemuan3

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.foundation.Image
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.draw.clip

@Composable
fun TugasLogin(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.TopCenter
    ) {
        // 1. Latar Belakang Gambar
        Image(
            painter = painterResource(id = R.drawable.bg_bangunan), // Ganti dengan nama drawable bg Anda
            contentDescription = "Background",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        // 2. Konten Utama Terurut Vertikal
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 24.dp)
        ) {
            // Judul Halaman
            Text(
                text = "Login",
                color = Color.Blue,
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Ini adalah halaman login,",
                color = Color.White,
                fontSize = 14.sp
            )
            Spacer(modifier = Modifier.height(30.dp))

            // Logo UMY
            Image(
                painter = painterResource(id = R.drawable.logo_umy), // Ganti nama drawable logo UMY
                contentDescription = "Logo UMY",
                modifier = Modifier.size(150.dp)
            )
            Spacer(modifier = Modifier.height(40.dp))

            // Identitas Diri
            Text(
                text = "Nama",
                color = Color.Red,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Rossa Kayla Isma Aziz",
                color = Color.Blue,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = "20240140215",
                color = Color.Black,
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(30.dp))

            // Gambar Bulat
            Image(
                painter = painterResource(id = R.drawable.img_ti), // Ganti nama drawable TI
                contentDescription = "Foto TI",
                modifier = Modifier
                    .size(220.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )
        }
    }
}