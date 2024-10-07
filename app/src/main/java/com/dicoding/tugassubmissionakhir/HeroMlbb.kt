package com.dicoding.tugassubmissionakhir

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class HeroMlbb(
    val name: String,
    val peran: String,
    val gelar: String,
    val spesialis: String,
    val rilis: String,
    val photo: String,
    val detail : String
) : Parcelable
