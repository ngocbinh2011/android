package au.edu.swin.sdmd.myapp

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import org.junit.Test

class MainActivity2Test {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity2::class.java)

    @Test
    fun testChangeLocationName() {
        // Click on the image
        onView(withId(R.id.imageView)).perform(click())

        // Change the name of the location
        onView(withId(R.id.editTextName)).perform(click(), typeText("New Location Name"))

        // Press back to go back to the first activity
        onView(withId(android.R.id.content)).perform(click())

        // Check that the new location name appears in the first activity
        onView(withText("New Location Name")).check(matches(isDisplayed()))
    }
}