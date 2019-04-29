package com.stackroute.tdd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TomJerryTest {
 TomJerry t;

   @Before
  public void setUp() throws Exception {
        t=new TomJerry();
   }

   @After
    public void tearDown() throws Exception {
    }

    @Test
    public void jerryEven() {
        assertEquals( "Jerry",t.name(22));
    }
    @Test
    public void tomOdd(){
       assertEquals("Tom",t.name(23));
    }
    @Test
    public void errorGreaterEven(){
       assertEquals("error",t.name(50));
    }

    @Test
    public void errorGreaterOdd(){
        assertEquals("error",t.name(51));
    }
    @Test
    public void errorLowerEven() {
        assertEquals("error", t.name(10));
    }
    @Test
    public void errorLowerOdd() {
        assertEquals("error", t.name(11));
    }
    @Test
    public void sameLower() {
        assertEquals("error", t.name(20));
    }

    @Test
    public void sameUpper() {
        assertEquals("error", t.name(30));
        }

}
