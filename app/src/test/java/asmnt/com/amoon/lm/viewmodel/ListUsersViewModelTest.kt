package asmnt.com.amoon.lm.viewmodel

import androidx.lifecycle.Observer
import asmnt.com.amoon.lm.data.remote.response.Response
import asmnt.com.amoon.lm.domain.model.Book
import asmnt.com.amoon.lm.domain.repository.BookRepository
import asmnt.com.amoon.lm.ui.books.ListBooksViewModel
import asmnt.com.amoon.lm.util.schedulers.TestSchedulerProvider
import io.reactivex.schedulers.TestScheduler
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.mockito.Mockito.*

@RunWith(JUnit4::class)
class ListBooksViewModelTest {


    private lateinit var bookRepository: BookRepository

    private lateinit var listBooksViewModel: ListBooksViewModel

    @Before
    fun setUp() {
        bookRepository = mock<BookRepository>(BookRepository::class.java)
        listBooksViewModel = ListBooksViewModel(
                TestSchedulerProvider(TestScheduler()),
                bookRepository
        )

    }

    @Test
    fun loadBooksWithSuccess() {
        val result = mock(Observer::class.java)
        listBooksViewModel.response.observeForever(result as Observer<Response<List<Book>>>)
        listBooksViewModel.loadData()
        verify<BookRepository>(bookRepository).getBooks()
    }

}