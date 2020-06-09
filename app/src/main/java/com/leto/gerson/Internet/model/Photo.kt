package com.leto.gerson.Internet.model

import com.google.gson.annotations.SerializedName

class Photo (
    @SerializedName("id")
    val id: Int?,
    @SerializedName("title")
    val title: String?,
    @SerializedName("thumbnailUrl")
    val thumbnail: String?
)

