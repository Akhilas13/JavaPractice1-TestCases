package com.stackroute.tdd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CapitalTest {
    Capital c;

    @Before
    public void setUp() throws Exception {
        c=new Capital();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void uppercase() {
        assertEquals(0,c.letter('A'));

    }
    @Test
    public void lowercase() {
        assertEquals(0,c.letter('a'));

    }
    @Test
    public void digit() {
        assertEquals(0,c.letter("6"));

    }

}