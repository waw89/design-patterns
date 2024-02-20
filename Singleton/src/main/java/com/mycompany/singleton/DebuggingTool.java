/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.singleton;

/**
 *
 * @author luisp
 * 
 * This class represents an implementation of the Singleton using the lazy method
 * This verifies if the debug mode is enabled, then calls the SingletonLazy class. 
 * Finally it calls the log method from this class in order to log something to the console.
 */
public class DebuggingTool {
    
    
    public static void main (String [] args)
    {
        
        if(debugModeEnabled()){
            SingletonLazy loggerExample = SingletonLazy.getInstance();
            loggerExample.log("This is a new log");
        }
        
    }
    
    public static boolean debugModeEnabled()
    {
        // assuming the debug mode is enabled
        return true;
    }
}
