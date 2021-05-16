package pvrServices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class PVRCinemasServices {
	
	private static WebDriver newBrowserInstance;
	
	//User defined Method for Returning the Browser Instance of user choice
	public static WebDriver getBrowserInstance() throws IOException
	{
		//For Chrome browser
		//Step 1.1: Adding the User interaction..
		BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Please Enter Your Choice/Type[Chrome/FF/IE]");
		
		String browserChoice = userInput.readLine(); 
		
		//Logic for Checking the Browser types...
		if(browserChoice.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Components\\chromedriver.exe");
			newBrowserInstance = new ChromeDriver();
		
		}else if(browserChoice.equalsIgnoreCase("FF"))
		{
			System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\Components\\geckodriver.exe");
			newBrowserInstance = new FirefoxDriver();
		
		}else if(browserChoice.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\Components\\IEDriver.exe");
			newBrowserInstance = new InternetExplorerDriver();
		}
		return newBrowserInstance;
	}	
}
