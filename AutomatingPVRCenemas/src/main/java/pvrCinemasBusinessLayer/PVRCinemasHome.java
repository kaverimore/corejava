package pvrCinemasBusinessLayer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import pvrServices.PVRCinemasServices;

public class PVRCinemasHome {
	
		//Local Variables for storing the WeDriver path and web app path..
		private WebDriver newWebDriver;//Variable to store/point to  new Browser instance creatd
		private String WebAppURL="https://www.naukri.com/";
		
		public PVRCinemasHome()
		{
			//TODO Auto-generated constructor stub
		}
		
		public String automatingMovieSearchFeature() throws InterruptedException
		{
			try {
				
			//Step 1: Creating the Browser instance using the browser specific driver .exe files..
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Components\\chromedriver.exe");
			newWebDriver = new ChromeDriver();
							
			//Step 1.1: Adding the User interaction..
			BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("Please Enter Your Choice/Type[Chrome/FF/IE]");
			String browserChoice = userInput.readLine(); 
			
			//Invoking the Service layer method for getting the browser instance...
			newWebDriver = PVRCinemasServices.getBrowserInstance();
			
			
			//Step 2: Launching the browser and loading the web application..
			newWebDriver.get(WebAppURL);
			
			//Implementing Implicit wait..
			newWebDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			//Maximising the Browser
			newWebDriver.manage().window().maximize();
		
			//Step3: Business logic step for automating movie search feature.
				//Step 3.1: Locating the Search Movie drop down text box
				//WebElement searchTextBox= newWebDriver.findElement(By.xpath("//*[@id=\'main__wrapper\']/app-root/app-full-layout/nav/div/div[1]/div/div/div[2]/div[1]/div[1]/p-autocomplete/span/input"));
				
				//#main__wrapper >app-root>app-full-layout>nav>div>div:nth-child(1)>div>div>div.navbar-form.nav-middle.nav-element>div.form-holder>div.form-element.search-element>p-autocomplete>span>button>span.ui-button-icon-left.ui-c.fa.fa-fw.fa-fw.fa-caret-down
				WebElement searchTextBox= newWebDriver.findElement(By.xpath("//*[@class=ui-autocomplete-dropdown ui-button ui-widget ui-state-default ui-corner-all ui-button-icon-only ui-state-focus ui-state-hover ui-state-active"));
				
				//searchTextBox.click();
				
				//Step 3.2: Pushing text into Search Drop Down text box..
				//searchTextBox.sendKeys("Ahe");	
				
				Select movies= new Select(searchTextBox);
				
				//movies.selectByVisibleText("Ahemdabad");
				   
				movies.selectByIndex(1);
				
				System.out.print("Sucessfully Automated...");
				
				Thread.sleep(8000);
				
				//Step 4: Close all the objects Created
				newWebDriver.quit();
				
		} //Closing of try
		catch(NoSuchElementException nsee) {
			System.out.println("Oops!! Element Not Found Exception Thrown");
			}
			
		catch(IllegalArgumentException iae){
			System.out.println("Oops!! Method Argument Null Exception Thrown");
			}
		
		catch (Exception e) {
			System.out.println("Oops!! No Exception class Able to Handle the Exception..");
		}
		finally {
			System.out.println("In finally block..");
			//Step 4: Close all the objects Created
			newWebDriver.quit();
		}
			return "True";
		
		}//End of the Method
		
		//User defined method for handling additional pop up windows......
		public String automatingHandlingPopupsWindows(String webApplicationURL) 
		{
			try {
				
			//Step 1: Creating the Browser instance of choice... through service layer method..
			
			//Invoking the Service layer method for getting the browser instance...
			newWebDriver = PVRCinemasServices.getBrowserInstance();
			
			//Step 2: Launching the browser and loading the web application..
			newWebDriver.get(WebAppURL);
			
			//Implementing Implicit wait..
			newWebDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			//Maximising the Browser
			newWebDriver.manage().window().maximize();
		
			//Step3: Business logic step for automating handling pop ups..
				/* Handling windows :
				 -------------------------------
				1. Get all the windows unique ID's by getWindowHandle() / getWindowHandles() method.
				2. SwitchTo() the focus each to windows till we find the matching title. And then work on it once we find 
				3. Close/ignore all other windows.*/   
				  
				//Logic for automating,Handling single window poping up...
				/*String windowHandle = newWebDriver.getWindowHandle();
				System.out.println(windowHandle);
				
				//Switching the focus onto the window..
				newWebDriver.switchTo().window(windowHandle);
				
				//Checking the window title...
				if(newWebDriver.getTitle().equals(windowHandle))
					System.out.println("Matching!!!");
				else
					System.out.println("Not Matching");
				*/
			
			//Logic for handling multiple windows poping Ups....
			Set<String> windowHandle = newWebDriver.getWindowHandles();
			System.out.println("TotaNo  of poups: "+ windowHandle.size());
			
			for(String handle : windowHandle) {
				newWebDriver.switchTo().window(handle); //Switching to focus onto the window
				
				System.out.println(newWebDriver.getTitle());
				
				//if(!"Jobs-Recruitment-Job Search -Employment- Job Vacancies)
				if(!"Automation...".equalsIgnoreCase(newWebDriver.getTitle()))
					newWebDriver.close();
					
			}//For.. each closing
		} 
		//Closing of try
		catch(NoSuchElementException nsee) {
			System.out.println("Oops!! Element Not Found Exception Thrown");
			}
			
		catch(IllegalArgumentException iae){
			System.out.println("Oops!! Method Argument Null Exception Thrown");
			}
		
		catch (Exception e) {
			System.out.println("Oops!! No Exception class Able to Handle the Exception..");
		}
		finally {
			System.out.println("In finally block..");
			//Step 4: Close all the objects Created
			newWebDriver.quit();
		}
			return "True";
		
		}//Closing of method
		
		
		public String automatingHandlingAlertPopupsWindows(String webApplicationURL) 
		{
			WebDriver neWebBrowser = null;
			
			try {
				
			//Step 1: Creating the Browser instance of choice... through service layer method..
			
			//Invoking the Service layer method for getting the browser instance...
			neWebBrowser = PVRCinemasServices.getBrowserInstance();
			
			//Step 2: Launching the browser and loading the web application..
			neWebBrowser.get(WebAppURL);
			
			//Implementing Synchronisation Concept
			/*1.Implicit Synchronisation/ Wait: Unconditional Wait
			 * 2. Explicit Synchronisation/ Wait: Conditional Wait
			 */
			
			//Implementing Implicit wait..
			neWebBrowser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  //Implicit wait..
			//Implementing Conditional Wait../Explicit
			//WebDriverWait wait = new WebDriverWait(newWebDriver , 30);
			//wait.until(ExpectedCondition.invisibilityOfElementLocated(By.className("loadingWhiteBox")));
			
			//Step3: Writing the actual Business logic step for automating handling of the Alert pop ups..
				   
			//Logic for automating,Handling alert pop ups...
			
			WebElement ecoSystemLinkText = neWebBrowser.findElement(By.xpath("//*[@id='menu2413']/span"));
			boolean yesOrNo = ecoSystemLinkText.isSelected();
			
			if(yesOrNo == true) {
				WebElement authenticationDevicesLink = neWebBrowser.findElement(By.xpath("//*[@id='menu2435']/span"));
				authenticationDevicesLink.click();
				}
				else {
					System.out.println("OOPs!! something went wrong plz try again.......");
				}
			
			/*WebElement simpleAlertButton = neWebBrowser.findElement(By.xpath("//*[@id='content']/p[3]/button"));
			((JavascriptExecutor) neWebBrowser).executeScript("argument[0].click();", simpleAlertButton);
			 //simpleAlertButton.click();
			*/
			
			//Locating the web element and associating the click event...
			WebElement certifiedBiometricLinkText = neWebBrowser.findElement(By.xpath("//*[@id=\'tjmod-755\']/div[2]/div/ul/li[3]/a"));
			certifiedBiometricLinkText.click();
			
			//Logic to Switching the focus onto the pop up..
			Alert newAlert = neWebBrowser.switchTo().alert(); //Switches the focus onto the alert pop up..
			
			String alertPopupText = newAlert.getText();
			System.out.println(alertPopupText);
			
			//((JavascriptExecutor) neWebBrowser).executeScript("argument[0].click();", simpleAlertButton);
			 newAlert.accept();  //Clicking on the OK button within the alert pop up..

		} 
		//Closing of try
		catch(NoSuchElementException nsee) {
			System.out.println("Oops!! Element Not Found Exception Thrown");
			}
			
		catch(IllegalArgumentException iae){
			System.out.println("Oops!! Method Argument Null Exception Thrown");
			}
		
		catch (Exception e) {
			System.out.println("Oops!! No Exception class Able to Handle the Exception..");
		}
		finally {
			System.out.println("In finally block..");
			//Step 4: Close all the objects Created
			newWebDriver.quit();
		}
			return "True";
		}//Closing of method
}
