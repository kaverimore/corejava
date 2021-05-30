package com.testometer.pvrCinemasMain;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pvrServices.PVRCinemasServices;

public class PVRCinemasServicesTest {
	
	
 /* @BeforeMethod
 public void beforeMethod()
 {
	  System.out.println("Welcom.......");
 }*/
  
  /*@Test(priority = 6)
  public void getBrowserInstanceTest1() throws IOException {
	  
	  WebDriver actualReturnedValue = null;
	  
	  //Invoke the actual business logic class method
	  actualReturnedValue = PVRCinemasServices.getBrowserInstance();
	  
	  //Asserting the WebDriver instance...
	  Assert.assertEquals(actualReturnedValue, new String());
  }
  */
  @Test //(priority = 4)//lower the priority execute first
  public void SampleTest1() throws IOException {
	  
	  String actualReturnedValue = "Welcome";
	  
	  //Asserting the WebDriver instance...
	  Assert.assertEquals(actualReturnedValue, new String("Welcome 1"));
  } 
  
  @Test //(priority = 3)
  public void sampleTest2() throws IOException {
	  
	  String actualReturnedValue = "Hello";
	  
	  //Asserting the WebDriver instance...
	  Assert.assertEquals(actualReturnedValue, new String("Hello"));
   } 
  /*
  @AfterMethod
  public void afterMethod()
  {
	  System.out.println("Bye.........");
  }*/

}

