/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.singleton;

/**
 *
 * @author luisp
 * 
 * The singleton eager method creates the singleton instance in class loading time.
 * This has a disadvantage and it is that needed or not, the instance is going to be created.
 */
public class SingletonEager {
    
    // We are going to start creating an instance variable
    
    private static final SingletonEager instance = new SingletonEager(); 
    
    private SingletonEager(){
    
    }
    
    public static SingletonEager getInstance() {
        
        return instance;    
        
    }
    
    public void displaySettings(){
        System.out.println("Displaying settings....");
    }
}
