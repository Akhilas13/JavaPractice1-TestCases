package com.stackroute.tdd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    Palindrome number;

    @Before
    public void setUp() throws Exception {
        number=new Palindrome();
    }

    @After
    public void tearDown() throws Exception {
        number=null;
    }

    @Test
    public void testPalindromeLesser() throws Exception {
        assertEquals(4,number.palindromeMethod(1221));
    }
    @Test
    public void testPalindromeGreater() throws Exception{

        assertEquals(32, number.palindromeMethod(8888));
    }

    @Test
    public void testNotPalindrome() throws Exception{

        assertEquals(0,number.palindromeMethod(0221));
    }
    @Test
    public void testSingledigitPalindrome() throws Exception{

        assertEquals(0,number.palindromeMethod(5));
    }
    @Test
    public void testOddNumberPalindrome() throws Exception{

        assertEquals(0,number.palindromeMethod(333));
    }


}