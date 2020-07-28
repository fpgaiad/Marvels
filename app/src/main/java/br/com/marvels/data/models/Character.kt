package br.com.marvels.data.models

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Entity(tableName = "characters")
@Parcelize
data class Character(

    @PrimaryKey
    val id: Int,
    val description: String,
    val modified: String,
    val name: String,
    @ColumnInfo(name = "resource_uri")
    val resourceURI: String,
    @Embedded(prefix = "thumbnail_")
    val thumbnail: Thumbnail
) : Parcelable