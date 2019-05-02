package com.stackroute.tdd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TomJerryTest {
 TomJerry names;

   @Before
  public void setUp() throws Exception {
        names=new TomJerry();
   }

   @After
    public void tearDown() throws Exception {
       names=null;
    }

    @Test
    public void testJerryEven() {
        assertEquals( "Jerry",names.name(22));
    }
    @Test
    public void testTomOdd(){
       assertEquals("Tom",names.name(23));
    }
    @Test
    public void testErrorGreaterEven(){
       assertEquals("error",names.name(50));
    }

    @Test
    public void testErrorGreaterOdd(){
        assertEquals("error",names.name(51));
    }
    @Test
    public void testErrorLowerEven() {
        assertEquals("error", names.name(10));
    }
    @Test
    public void testErrorLowerOdd() {
        assertEquals("error", names.name(11));
    }
    @Test
    public void testSameLower() {
        assertEquals("error", names.name(20));
    }

    @Test
    public void testSameUpper() {
        assertEquals("error", names.name(30));
        }

}
