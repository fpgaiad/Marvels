package br.com.marvels.data.models

import android.os.Parcelable
import androidx.room.ColumnInfo
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ComicsItem(
    val name: String,
    @ColumnInfo(name = "resource_uri")
    val resourceURI: String
) : Parcelable