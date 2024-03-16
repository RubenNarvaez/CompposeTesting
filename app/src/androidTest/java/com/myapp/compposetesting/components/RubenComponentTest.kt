package com.myapp.compposetesting.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.test.assertContentDescriptionContains
import androidx.compose.ui.test.assertContentDescriptionEquals
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.assertIsEnabled
import androidx.compose.ui.test.assertIsFocused
import androidx.compose.ui.test.assertIsNotDisplayed
import androidx.compose.ui.test.assertIsNotEnabled
import androidx.compose.ui.test.assertIsNotFocused
import androidx.compose.ui.test.assertIsNotSelected
import androidx.compose.ui.test.assertIsOff
import androidx.compose.ui.test.assertIsOn
import androidx.compose.ui.test.assertIsSelectable
import androidx.compose.ui.test.assertTextContains
import androidx.compose.ui.test.assertTextEquals
import androidx.compose.ui.test.doubleClick
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onAllNodesWithContentDescription
import androidx.compose.ui.test.onAllNodesWithTag
import androidx.compose.ui.test.onAllNodesWithText
import androidx.compose.ui.test.onFirst
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performImeAction
import androidx.compose.ui.test.performScrollTo
import androidx.compose.ui.test.performTextClearance
import androidx.compose.ui.test.performTextInput
import androidx.compose.ui.test.performTextReplacement
import androidx.compose.ui.test.performTouchInput
import androidx.compose.ui.test.swipeDown
import androidx.compose.ui.test.swipeLeft
import androidx.compose.ui.test.swipeRight
import androidx.compose.ui.test.swipeUp
import androidx.test.espresso.action.ViewActions.longClick
import org.junit.Rule
import org.junit.Test

class RubenComponentTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun myFirstTest() {
        composeTestRule.setContent {
            RubenComponent()
        }


        //Finder
        composeTestRule.onNodeWithText("Aris", ignoreCase = true)
        composeTestRule.onNodeWithTag("textComponent1")
        composeTestRule.onNodeWithContentDescription("superImage")

        composeTestRule.onAllNodesWithText("r", ignoreCase = true)
        composeTestRule.onAllNodesWithTag("component1")
        composeTestRule.onAllNodesWithContentDescription(("super"))

        //Actions
        composeTestRule.onNodeWithText("Aris", ignoreCase = true).performClick()
        composeTestRule.onAllNodesWithText("Aris").onFirst().performClick()
        composeTestRule.onNodeWithText("Aris", ignoreCase = true).performTouchInput {
            doubleClick()
            longClick()
            swipeDown()
            swipeLeft()
            swipeUp()
            swipeRight()
        }
        composeTestRule.onNodeWithText("Aris", ignoreCase = true).performScrollTo()
        composeTestRule.onNodeWithText("Aris", ignoreCase = true).performImeAction()
        composeTestRule.onNodeWithText("Aris", ignoreCase = true).performTextClearance()
        composeTestRule.onNodeWithText("Aris", ignoreCase = true)
            .performTextInput("This in the text")
        composeTestRule.onNodeWithText("Aris", ignoreCase = true)
            .performTextReplacement("replace words")

        //Assertions
        composeTestRule.onNodeWithText("Aris", ignoreCase = true).assertExists()
        composeTestRule.onNodeWithText("Aris", ignoreCase = true).assertDoesNotExist()
        composeTestRule.onNodeWithText("Aris", ignoreCase = true).assertContentDescriptionContains("Description")
        composeTestRule.onNodeWithText("Aris", ignoreCase = true).assertContentDescriptionEquals("Description")
        composeTestRule.onNodeWithText("Aris", ignoreCase = true).assertIsDisplayed()
        composeTestRule.onNodeWithText("Aris", ignoreCase = true).assertIsNotDisplayed()
        composeTestRule.onNodeWithText("Aris", ignoreCase = true).assertIsEnabled()
        composeTestRule.onNodeWithText("Aris", ignoreCase = true).assertIsNotEnabled()
        composeTestRule.onNodeWithText("Aris", ignoreCase = true).assertIsSelectable()
        composeTestRule.onNodeWithText("Aris", ignoreCase = true).assertIsNotSelected()
        composeTestRule.onNodeWithText("Aris", ignoreCase = true).assertIsFocused()
        composeTestRule.onNodeWithText("Aris", ignoreCase = true).assertIsNotFocused()
        composeTestRule.onNodeWithText("Aris", ignoreCase = true).assertIsOn()
        composeTestRule.onNodeWithText("Aris", ignoreCase = true).assertIsOff()
        composeTestRule.onNodeWithText("Aris", ignoreCase = true).assertTextEquals("This word")
        composeTestRule.onNodeWithText("Aris", ignoreCase = true).assertTextContains("Tis rd")
    }

    @Test
    fun verifyComponentStartWithRuben(){
        composeTestRule.setContent {
            RubenComponent()
        }
        composeTestRule.onNodeWithText("Ruben", ignoreCase = true).assertExists()

    }
}
