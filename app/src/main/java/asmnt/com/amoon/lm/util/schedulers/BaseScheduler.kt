package asmnt.com.amoon.lm.util.schedulers

import androidx.annotation.NonNull
import io.reactivex.Scheduler




interface BaseScheduler {

    // Scheduler for IO related stuffs
    @NonNull
    fun io(): Scheduler

    // Scheduler bring back the execution to the main thread so that UI modification can be made
    @NonNull
    fun ui(): Scheduler

}