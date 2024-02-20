/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.singleton;

/**
 *
 * @author luisp
 */
public class Application {
    
    public static void main (String [] args){
        
        SingletonEager configManager = SingletonEager.getInstance();
        
        configManager.displaySettings();
    }
}
