package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBrReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void twoBrReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));
    }
    @Test
    public void brWithinBrReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }
    @Test
    public void twoBrWithinBrReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[]]]"));
    }
    @Test
    public void two2BrWithinBrReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[][]]]"));
    }

    @Test
    public void emptyString(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
    @Test
    public void stringInBr(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[word]"));
    }
// negative test
    @Test
    public void oneSideBr(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void closeBr(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }
    @Test
    public void mismatchBr(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void mismatchBrWithWord(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[pizza]]"));
    }



}
