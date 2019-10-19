package com.Ellaelatul12.smkcoding

import android.os.Parcelable
import android.widget.RatingBar
import kotlinx.android.parcel.Parcelize
import java.io.FileDescriptor
@Parcelize
data class MovieModel(
    var title: String? = null,

    val rating: Int? = null,

    var image: String? = null,

    var description: String? = null

): Parcelable