package com.lcardoso.android_test.usecase

import com.lcardoso.android_test.api.defaultSchedulers
import com.lcardoso.android_test.data.JokesRepositoryImp
import com.lcardoso.android_test.data.database.JokeEntity

class AddFavoriteJokeUseCase(
    private val repository: JokesRepositoryImp
) {
    fun execute(params: Param) = repository.addFavoriteJoke(
        JokeEntity(id = params.id, category = params.category, joke = params.joke)
    ).defaultSchedulers()

    data class Param(
        val id: String,
        val category: String,
        val joke: String
    )
}