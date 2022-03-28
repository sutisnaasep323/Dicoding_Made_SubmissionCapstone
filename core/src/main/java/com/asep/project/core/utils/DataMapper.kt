package com.asep.project.core.utils

import com.asep.project.core.data.source.local.entity.MovieEntity
import com.asep.project.core.data.source.remote.response.MovieResponse
import com.asep.project.core.data.source.remote.response.TvShowResponse
import com.asep.project.core.domain.model.Movie

object DataMapper {
    fun mapMovieResponsesToEntities(input: List<MovieResponse>): List<MovieEntity> {
        val movieList = ArrayList<MovieEntity>()
        input.map {
            val movie = MovieEntity(
                it.overview,
                it.originalLanguage,
                it.releaseDate,
                it.popularity,
                it.voteAverage,
                it.id,
                it.title,
                it.voteCount,
                it.posterPath,
                favorite = false,
                isTvShows = false
            )
            movieList.add(movie)
        }
        return movieList
    }

    fun mapTvShowResponsesToEntities(input: List<TvShowResponse>): List<MovieEntity> {
        val movieList = ArrayList<MovieEntity>()
        input.map {
            val movie = MovieEntity(
                it.overview,
                it.originalLanguage,
                it.firstAirDate,
                it.popularity,
                it.voteAverage,
                it.id,
                it.name,
                it.voteCount,
                it.posterPath.orEmpty(),
                favorite = false,
                isTvShows = true
            )
            movieList.add(movie)
        }
        return movieList
    }

    fun mapDomainToEntity(input: Movie): MovieEntity {
        return MovieEntity(
            input.overview,
            input.originalLanguage,
            input.releaseDate,
            input.popularity,
            input.voteAverage,
            input.id,
            input.title,
            input.voteCount,
            input.posterPath,
            favorite = input.favorite,
            isTvShows = input.isTvShows
        )
    }

    fun mapEntitiesToDomain(input: List<MovieEntity>): List<Movie> {
        return input.map {
            Movie(
                it.overview,
                it.originalLanguage,
                it.releaseDate,
                it.popularity,
                it.voteAverage,
                it.id,
                it.title,
                it.voteCount,
                it.posterPath,
                favorite = it.favorite,
                isTvShows = it.isTvShows
            )
        }
    }
}