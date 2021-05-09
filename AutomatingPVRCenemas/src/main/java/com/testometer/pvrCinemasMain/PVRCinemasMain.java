package com.testometer.pvrCinemasMain;

import pvrCinemasBusinessLayer.PVRCinemasHome;

/**
 * Hello world!
 *
 */
public class PVRCinemasMain 
{
    public static void main( String[] args ) throws InterruptedException
    {
       // System.out.println( "Hello World!" );
        
        //Creating Objects for invoking automation methods...
        PVRCinemasHome newPVRCinema = new PVRCinemasHome();
        
        //newPVRCinema.automatingMovieSearchFeature();
        
        newPVRCinema.automatingHandlingPopupsWindows("https://www.naukri.com/");
        
    }
}
