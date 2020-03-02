package asmnt.com.amoon.lm.di

import asmnt.com.amoon.lm.TestApp
import asmnt.com.amoon.lm.di.modules.ActivityBuildersModule
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton


@Singleton
@Component(modules = [
    (AndroidSupportInjectionModule::class),
    (ActivityBuildersModule::class),
    (TestAppModule::class)
])
interface TestAppComponent : AndroidInjector<TestApp> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<TestApp>()

}