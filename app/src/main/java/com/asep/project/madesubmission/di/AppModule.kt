package com.asep.project.madesubmission.di

import com.asep.project.core.domain.usecase.MovieAppInteractor
import com.asep.project.core.domain.usecase.MovieAppUseCase
import com.asep.project.madesubmission.detail.DetailViewModel
import com.asep.project.madesubmission.home.SearchViewModel
import com.asep.project.madesubmission.movies.MoviesViewModel
import com.asep.project.madesubmission.tvshows.TvShowsViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.FlowPreview
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module


val useCaseModule = module {
    factory<MovieAppUseCase> { MovieAppInteractor(get()) }
}

@ExperimentalCoroutinesApi
@FlowPreview
val viewModelModule = module {
    viewModel { MoviesViewModel(get()) }
    viewModel { TvShowsViewModel(get()) }
    viewModel { DetailViewModel(get()) }
    viewModel { SearchViewModel(get()) }
}