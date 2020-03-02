package asmnt.com.amoon.lm.ui.books

import android.util.Log
import asmnt.com.amoon.lm.data.remote.response.Response
import asmnt.com.amoon.lm.data.remote.response.Status
import asmnt.com.amoon.lm.domain.model.Book
import asmnt.com.amoon.lm.domain.repository.BookRepository
import asmnt.com.amoon.lm.ui.base.BaseViewModel
import asmnt.com.amoon.lm.util.schedulers.BaseScheduler
import javax.inject.Inject


class ListBooksViewModel
@Inject constructor(
        private val scheduler: BaseScheduler,
        private val bookRepository: BookRepository
) : BaseViewModel<List<Book>>() {

// get book data  from repository
    override fun loadData() {
        bookRepository.getBooks()
                .subscribeOn(scheduler.io())
                .observeOn(scheduler.ui())
                .doOnSubscribe { loadingStatus.setValue(true) }
                .doAfterTerminate { loadingStatus.setValue(false) }
                .subscribe({
                    result -> response.value = Response(Status.SUCCESS, result.results.books, null)
                }, {
                    throwable -> response.setValue(Response(Status.ERROR, null, throwable))
                })

    }

}