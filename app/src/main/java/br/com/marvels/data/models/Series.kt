package br.com.marvels.data.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Series(
    val available: Int,
    val collectionURI: String,
    @SerializedName("items")
    val seriesItems: List<SeriesItem>,
    val returned: Int
) : Parcelable