package com.asep.project.madesubmission.movies

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.asep.project.core.data.Resource
import com.asep.project.core.domain.model.Movie
import com.asep.project.core.domain.usecase.MovieAppUseCase

class MoviesViewModel(private val movieAppUseCase: MovieAppUseCase) : ViewModel() {
    fun getMovies(sort: String): LiveData<Resource<List<Movie>>> {
        return movieAppUseCase.getAllMovies(sort).asLiveData()
    }
}