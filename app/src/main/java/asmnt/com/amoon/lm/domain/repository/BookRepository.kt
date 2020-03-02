package asmnt.com.amoon.lm.domain.repository

import android.util.Log
import asmnt.com.amoon.lm.data.remote.Api
import asmnt.com.amoon.lm.domain.model.ApiRes
import asmnt.com.amoon.lm.util.KEY
import io.reactivex.Observable
import javax.inject.Inject


class BookRepository @Inject constructor(private val api: Api) {

    // call fetchBook from api
    fun getBooks(): Observable<ApiRes> {
        return api.fetchBooks(KEY)
    }

}