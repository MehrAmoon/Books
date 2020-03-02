package asmnt.com.amoon.lm

import asmnt.com.amoon.lm.viewmodel.ListBooksViewModelTest
import org.junit.runner.RunWith
import org.junit.runners.Suite
import org.junit.runners.Suite.SuiteClasses

@RunWith(Suite::class)
@SuiteClasses(*[
    (ListBooksViewModelTest::class)
    ])
class TestSuite