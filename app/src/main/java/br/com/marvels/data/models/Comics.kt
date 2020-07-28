package br.com.marvels.data.models

import android.os.Parcelable
import androidx.room.Embedded
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Comics(
    val available: Int,
    val collectionURI: String,
    @Embedded(prefix = "items_")
    val items: List<ComicsItem>,
    val returned: Int
) : Parcelable