package com.stackroute.tdd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CapitalTest {
    Capital lettercase;

    @Before
    public void setUp() throws Exception {
        lettercase=new Capital();
    }

    @After
    public void tearDown() throws Exception {\
        lettercase=null;
    }

    @Test
    public void testUppercase()
    {
        assertEquals(0,lettercase.letter('A'));

    }
    @Test
    public void testLowercase()
    {
        assertEquals(0,lettercase.letter('a'));

    }
    @Test
    public void testDigit()
    {
        assertEquals(0,lettercase.letter('6'));

    }
    @Test
    public void testSymbol(){
        assertEquals(0,lettercase.letter('}'));
    }


}