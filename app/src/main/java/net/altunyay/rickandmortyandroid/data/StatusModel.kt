package net.altunyay.rickandmortyandroid.data

sealed class StatusModel<out T : Any>

object OnLoading : StatusModel<Nothing>()
data class OnSuccess<out T : Any>(val data: T?) : StatusModel<T>()
data class OnError(val msg: String?) : StatusModel<Nothing>()
object OnCompleted : StatusModel<Nothing>()