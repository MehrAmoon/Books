package asmnt.com.amoon.lm.di.modules

import dagger.Module
import asmnt.com.amoon.lm.ui.books.ListBooksFragment
import dagger.android.ContributesAndroidInjector

// interface for fragments module
@Module
interface FragmentBuildersModule {

    @ContributesAndroidInjector
    fun contributeListBooksFragment(): ListBooksFragment

}