package com.stackroute.tdd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PetRockTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getname() throws Exception{
            PetRock rocky=new PetRock("Rocky");
            assertEquals("Rocky",rocky.getname());

    }
}




