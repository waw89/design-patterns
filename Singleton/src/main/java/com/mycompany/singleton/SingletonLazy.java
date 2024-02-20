/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.singleton;

/**
 *
 * @author luisp
 */
public class SingletonLazy {
    
    private static SingletonLazy instance;
    
    private SingletonLazy()
    {
        
    }
    
    public static SingletonLazy getInstance(){
        
        if(instance == null)
        {
            instance = new SingletonLazy(); 
        }
        
        return instance;
    }
    
    public void log(String message)
    {
        // Log message 
        System.out.println("Log: "+message);
    }
    
    
    
}
