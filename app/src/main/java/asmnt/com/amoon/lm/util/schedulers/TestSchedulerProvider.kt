package asmnt.com.amoon.lm.util.schedulers

import io.reactivex.Scheduler
import io.reactivex.schedulers.TestScheduler


class TestSchedulerProvider(private val testScheduler: TestScheduler) : BaseScheduler {

    override fun io(): Scheduler {
        return testScheduler
    }

    override fun ui(): Scheduler {
        return testScheduler
    }

}