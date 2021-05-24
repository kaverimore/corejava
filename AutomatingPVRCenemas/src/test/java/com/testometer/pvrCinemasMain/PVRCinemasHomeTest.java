package com.testometer.pvrCinemasMain;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import pvrCinemasBusinessLayer.PVRCinemasHome;

/**
 * Unit test for simple App.
 */
/*public class PVRCinemasHomeTest 
    extends TestCase
{
    *//**
     * Create the test case
     *
     * @param testName name of the test case
     *//*
    public PVRCinemasHomeTest( String testName )
    {
        super( testName );
    }

    *//**
     * @return the suite of tests being tested
     *//*
    public static Test suite()
    {
        return new TestSuite( PVRCinemasHomeTest.class );
    }

    *//**
     * Rigourous Test :-)
     *//*
    public void testApp()
    {
        assertTrue( true );
    }
}
*/
public class PVRCinemasHomeTest
{
	@org.junit.Test
	public void addingNumbersTest()
	{
		int actualReturnedValue;
		
		//invoking the actual method for testing to get the actual  result returned by the method....
		
		actualReturnedValue=PVRCinemasHome.addingOfNumbers();
		
		//Testing of actual Vs Expected for testing purpose....Assert Class...
		
		//Assert.assertEquals(25, actualReturnedValue);
		
		org.junit.Assert.assertEquals(25, actualReturnedValue);
	}
	@org.junit.Test
	public void addingNumbersTest2()
	{
		int actualReturnedValue;
		//invoking the actual method for testing to get the actual  result returned by the method....
		
		actualReturnedValue=PVRCinemasHome.addingOfNumbers();
		
		//Testing of actual Vs Expected for testing purpose....Assert Class...
		
		//Assert.assertEquals(25, actualReturnedValue);
		
		org.junit.Assert.assertEquals(35, actualReturnedValue);
	}
	
	
	}
	
	
