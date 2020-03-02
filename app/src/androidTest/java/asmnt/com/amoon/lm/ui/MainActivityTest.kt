package asmnt.com.amoon.lm.ui

import android.view.View
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.runner.AndroidJUnit4
import asmnt.com.amoon.lm.R
import asmnt.com.amoon.lm.util.RecyclerViewItemCountAssertion.Companion.hasItemCount
import org.hamcrest.Matchers.allOf
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnit
import androidx.test.rule.ActivityTestRule

@RunWith(AndroidJUnit4::class)
class MainActivityTest {


    @Rule
    @JvmField
    var activityRule: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)


    @Rule
    @JvmField
    var mockitoRule = MockitoJUnit.rule()


    @Test
    fun listBooksWithSuccess() {
        onView(allOf<View>(
                withId(R.id.recycler_view),
                isDescendantOfA(withId(R.id.list_books))
        )).check(hasItemCount(3))
    }

}