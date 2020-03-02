package asmnt.com.amoon.lm.di.components

import asmnt.com.amoon.lm.App
import asmnt.com.amoon.lm.di.modules.ActivityBuildersModule
import asmnt.com.amoon.lm.di.modules.AppModule
import asmnt.com.amoon.lm.di.modules.NetworkModule
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

//base component for the application
@Singleton
@Component(modules = [
    AndroidSupportInjectionModule::class,
    ActivityBuildersModule::class,
    AppModule::class,
    NetworkModule::class
])
interface AppComponent : AndroidInjector<App> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<App>()

}