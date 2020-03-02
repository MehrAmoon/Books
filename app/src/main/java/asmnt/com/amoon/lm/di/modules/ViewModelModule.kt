package asmnt.com.amoon.lm.di.modules

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import asmnt.com.amoon.lm.di.keys.ViewModelKey
import asmnt.com.amoon.lm.ui.common.ViewModelFactory
import asmnt.com.amoon.lm.ui.books.ListBooksViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

// interface for view model modules
@Module
interface ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(ListBooksViewModel::class)
    fun bindListBooksViewModel(listBooksViewModel: ListBooksViewModel) : ViewModel

    @Binds
    fun bindViewModelFactory(viewModelFactory: ViewModelFactory): ViewModelProvider.Factory

}