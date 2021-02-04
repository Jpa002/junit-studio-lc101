package test;

import org.junit.Test;

import static org.junit.Assert.*;
import static main.BalancedBrackets.hasBalancedBrackets;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(hasBalancedBrackets("[]"));
    }

    @Test (expected = IllegalArgumentException.class)
    public void nullThrowsIllegalArgumentException(){
        hasBalancedBrackets(null);
    fail("This should not happen because there should have been an error");
    }
}
