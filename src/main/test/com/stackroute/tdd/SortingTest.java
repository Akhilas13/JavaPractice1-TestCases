package com.stackroute.tdd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortingTest {
    Sorting decreasing;

    @Before
    public void setUp() throws Exception {
       decreasing=new Sorting();
    }



    @After
    public void tearDown() throws Exception {
        decreasing=null;
    }

    @Test
        public void testMixGreater () {
            assertEquals(1, decreasing.sum(6182));
        }
    @Test
        public void testMixLower(){
        assertEquals(0,decreasing.sum(2134));
    }
    @Test
        public void testOdd(){
            assertEquals(0,decreasing.sum(9999));
    }
    @Test
        public void testEvenGreater(){
        assertEquals(1,decreasing.sum(8888));
    }
    @Test
        public void testEvenLower(){
        assertEquals(0,decreasing.sum(222));
    }

}