package asmnt.com.amoon.lm.data.remote

import asmnt.com.amoon.lm.domain.model.ApiRes
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query


interface Api {

    // get books
    @GET("combined-print-and-e-book-fiction.json")
    fun fetchBooks(
            @Query("api-key") key: String
    ): Observable<ApiRes>

}