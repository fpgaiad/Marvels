package br.com.marvels.data.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ComicsItem(
    val name: String,
    val resourceURI: String
) : Parcelable