package asmnt.com.amoon.lm.data.remote.response

// response class
data class Response<out T> (
        val status: Int,
        val data: T?,
        val error: Throwable?
)