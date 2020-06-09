package com.leto.gerson.Internet.api

import com.leto.gerson.Internet.model.Photo
import io.reactivex.Single

interface PhotosApi {
    @GET("photos")
    fun getPhotos(): Single<List<Photo>>

    annotation class GET(val value: String)
}

