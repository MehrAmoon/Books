package asmnt.com.amoon.lm.di.modules

import asmnt.com.amoon.lm.data.remote.Api
import asmnt.com.amoon.lm.domain.repository.BookRepository
import asmnt.com.amoon.lm.util.schedulers.BaseScheduler
import asmnt.com.amoon.lm.util.schedulers.SchedulerProvider
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

// app modules
@Module(includes = [(ViewModelModule::class)])
class AppModule {

    @Provides
    @Singleton
    fun provideApi(retorfit: Retrofit) : Api {
        return retorfit.create(Api::class.java)
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