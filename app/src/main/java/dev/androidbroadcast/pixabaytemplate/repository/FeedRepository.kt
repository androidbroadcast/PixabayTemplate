package dev.androidbroadcast.pixabaytemplate.repository


import dev.androidbroadcast.pixabaytemplate.BuildConfig
import dev.androidbroadcast.pixabaytemplate.api.PixabayService
import javax.inject.Inject

class FeedRepository @Inject constructor(
    private val pixabayService: PixabayService
) {

    suspend fun search(query: String) = pixabayService.search(
        BuildConfig.PIXABAY_API_KEY,
        query
    )

}