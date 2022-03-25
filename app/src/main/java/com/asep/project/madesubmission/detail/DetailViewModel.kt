package com.asep.project.madesubmission.detail

import androidx.lifecycle.ViewModel
import com.asep.project.core.domain.model.Movie
import com.asep.project.core.domain.usecase.MovieAppUseCase

class DetailViewModel(private val movieAppUseCase: MovieAppUseCase) : ViewModel() {

    fun setFavoriteMovie(movie: Movie, newStatus: Boolean) {
        movieAppUseCase.setMovieFavorite(movie, newStatus)
    }
}
