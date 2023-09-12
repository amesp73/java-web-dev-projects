package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true, "Both values must be true");
    }

    // NEGATIVE TEST
    @Test
    public void oneOpenBracket() {
        String message = "A single open bracket returns false";
        String str = "[Hello";
        boolean result = BalancedBrackets.hasBalancedBrackets(str);
        assertFalse(result, message);
    }

    @Test
    public void oneOpenBracketPart2() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Hello"),
                "A single open bracket returns false");
    }

    @Test
    public void inputContainsNoBrackets () {
        String message = "If input contains no brackets return true";
        String str = "Hello";
        boolean result = BalancedBrackets.hasBalancedBrackets(str);
        assertTrue(result, message);
    }

    @Test
    public void bracketsInWrongOrder() {
        String message = "Return false if brackets are not in correct order";
        String str = "][";
        boolean result = BalancedBrackets.hasBalancedBrackets(str);
        assertFalse(result, message);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        String message = "If the string is just a pair of brackets, return true";
        String str = "[]";
        boolean result = BalancedBrackets.hasBalancedBrackets(str);
        assertTrue(result, message);
    }

    @Test
    public void singleOpenBracket() {
        String message = "If there is only one open string, return false";
        String str = "[";
        boolean result = BalancedBrackets.hasBalancedBrackets(str);
        assertFalse(result, message);
    }

    @Test
    public void singleClosedBracket() {

    }

}