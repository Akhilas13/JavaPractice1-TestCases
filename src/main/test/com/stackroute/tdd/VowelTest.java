package com.stackroute.tdd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelTest {
    Vowel v;

    @Before
    public void setUp() throws Exception {
        v=new Vowel();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void smallVowel() {
        assertEquals(0,v.letter("e"));
    }
    @Test
    public void largeVowel(){
        assertEquals(0,v.letter("o"));
    }
    @Test
    public void smallConsonant(){
        assertEquals(0,v.letter("y"));
    }

    @Test
    public void  largeConsonant(){
        assertEquals(0,v.letter("R"));

    }

}