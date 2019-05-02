package com.stackroute.tdd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelTest {
    Vowel alphabet;

    @Before
    public void setUp() throws Exception {
        alphabet=new Vowel();
    }

    @After
    public void tearDown() throws Exception {
        alphabet=null;
    }

    @Test
    public void testSmallVowel() {
        assertEquals(0,alphabet.letter("e"));
    }
    @Test
    public void testLargeVowel(){
        assertEquals(0,alphabet.letter("o"));
    }
    @Test
    public void testSmallConsonant(){
        assertEquals(0,alphabet.letter("y"));
    }

    @Test
    public void  testLargeConsonant(){
        assertEquals(0,alphabet.letter("R"));

    }

}