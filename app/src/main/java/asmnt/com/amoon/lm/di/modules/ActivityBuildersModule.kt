package asmnt.com.amoon.lm.di.modules

import asmnt.com.amoon.lm.ui.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

// interface for activities module
@Module
interface ActivityBuildersModule {

    @ContributesAndroidInjector(modules = [FragmentBuildersModule::class])
    fun contributeMainActivity(): MainActivity

}