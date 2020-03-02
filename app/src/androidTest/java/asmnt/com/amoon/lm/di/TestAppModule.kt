package asmnt.com.amoon.lm.di

import asmnt.com.amoon.lm.data.remote.Api
import asmnt.com.amoon.lm.di.modules.ViewModelModule
import asmnt.com.amoon.lm.domain.repository.BookRepository
import asmnt.com.amoon.lm.mock.Mocks.createBooks

import asmnt.com.amoon.lm.util.schedulers.BaseScheduler
import asmnt.com.amoon.lm.util.schedulers.SchedulerProvider
import dagger.Module
import dagger.Provides
import io.reactivex.Observable.just
import org.mockito.Mockito.`when`
import org.mockito.Mockito.mock
import javax.inject.Singleton

@Module(includes = [(ViewModelModule::class)])
internal class TestAppModule {

    @Provides
    @Singleton
    fun provideApi(): Api {
        val api = mock<Api>(Api::class.java)
        `when`(api.fetchBooks("3GiIylwhoiL0USYYl7IIMDwjqe5FNtqR")).thenReturn(just(
                createBooks()
        ))
        return api
    }

    @Provides
    @Singleton
    fun provideBookRepository(api: Api): BookRepository {
        return BookRepository(api)
    }


    @Provides
    @Singleton
    fun provideScheduler(): BaseScheduler {
        return SchedulerProvider()
    }

}