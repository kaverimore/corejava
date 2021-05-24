package com.testometer.pvrCinemasMain;

import java.awt.AWTException;
import java.io.IOException;

import pvrCinemasBusinessLayer.PVRCinemasHome;

/**
 * Hello world!
 *
 */

public class PVRCinemasMain 
{
    public static void main( String[] args ) throws InterruptedException, IOException, AWTException
    {
       // System.out.println( "Hello World!" );
        

    	//Creating Objects for invoking automation methods...
        PVRCinemasHome newPVRCinema = new PVRCinemasHome();
        
       // newPVRCinema.automatingMovieSearchFeature();
        
        //newPVRCinema.automatingHandlingPopupsWindows("https://www.naukri.com/");
        
        //newPVRCinema.alertPopupWorkFlowAutomation(); //Automating alert pop ups..
        
        //newPVRCinema.automationOfHandlingDBoxes();  //Automating the dialog box pop ups..
        
        //newPVRCinema.searchWorkflowAutomationUsingAUIAPI();  //Automating search fields using batch execution...
        
        newPVRCinema.automatingMovieSerchFeatureWithBatchExecution();  //Automating search fields using batch execution...
    }
}
