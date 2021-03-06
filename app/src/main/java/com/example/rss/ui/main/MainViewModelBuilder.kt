package com.example.rss.ui.main

import androidx.lifecycle.ViewModel
import com.example.rss.di.viewmodel.ViewModelKey
import com.example.rss.ui.favorite.FavoriteViewModel
import com.example.rss.ui.home.HomeViewModel
import com.example.rss.ui.home.jsonFeed.JsonFeedViewModelBuilder
import com.example.rss.ui.home.xmlFeed.XmlFeedViewModelBuilder
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module(includes = [JsonFeedViewModelBuilder::class, XmlFeedViewModelBuilder::class])
abstract class MainViewModelBuilder {

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    abstract fun bindMainViewModel(maniViewModel: MainViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(HomeViewModel::class)
    abstract fun bindHomeViewModel(homeViewModel: HomeViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(FavoriteViewModel::class)
    abstract fun bindFavoriteViewModel(favoriteViewModel: FavoriteViewModel): ViewModel
}