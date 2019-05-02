package com.stackroute.tdd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoopTest {
    Loop patterns;
    @Before
    public void setUp() throws Exception {
        patterns=new Loop();
    }

    @After
    public void tearDown() throws Exception {
        patterns=null;
    }

    @Test
    public void  testPattern()
    {
        assertEquals(0,patterns.pattern(5));

    }
    @Test
    public void testError(){
        assertEquals(0,patterns.pattern(0));
    }
}