package com.stackroute.tdd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    Palindrome p;

    @Before
    public void setUp() throws Exception {
        p=new Palindrome();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void palindromeLesser() throws Exception {
        assertEquals(4,p.pal(1221));
    }
    @Test
    public void palindromeGreater() throws Exception{

        assertEquals(32, p.pal(8888));
    }

    @Test
    public void notPalindrome() throws Exception{

        assertEquals(0,p.pal(0221));
    }
    @Test
    public void singledigitPalindrome() throws Exception{

        assertEquals(0,p.pal(5));
    }
    @Test
    public void oddNumberPalindrome() throws Exception{

        assertEquals(0,p.pal(333));
    }


}