package com.example.rss.domain.repository

import com.example.rss.domain.model.jsonFeed.ArticleModel
import io.reactivex.Flowable

interface JsonFeedRepository {

    fun getJsonFeed(sources:String, apiKey:String): Flowable<List<ArticleModel>>
}