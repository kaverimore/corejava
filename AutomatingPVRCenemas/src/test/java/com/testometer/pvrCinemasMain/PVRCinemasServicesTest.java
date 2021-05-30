package com.testometer.pvrCinemasMain;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pvrServices.PVRCinemasServices;

public class PVRCinemasServicesTest {
  @Test(priority = 6)
  public void getBrowserInstanceTest1() throws IOException {
	  
	  WebDriver actualReturnedValue = null;
	  
	  //Invoke the actual business logic class method
	  actualReturnedValue = PVRCinemasServices.getBrowserInstance();
	  
	  //Asserting the WebDriver instance...
	  Assert.assertEquals(actualReturnedValue, new String());
  }
  @Test(priority = 4)
  public void SampleTest2() throws IOException {
	  
	  String actualReturnedValue = "Welcome";
	  
	  //Asserting the WebDriver instance...
	  Assert.assertEquals(actualReturnedValue, new String("Hello"));
  }
}
