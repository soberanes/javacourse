/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.omnilife.paul.data;

/**
 *
 * @author paul.soberanes
 */
public class Variables {
    
    public void scope()
    {
        int x; // known to all code within function
        
        x = 10;
        if (x == 10) { // start new scope
            int y = 20; // known only to this block
            
            // x and y both known here
            System.out.println("x and y: " + x + " " + y);
            x = y * 2;
        }        
        //y = 100; // Error! y not known here
        
        // x is still known here
        
        System.out.println("x is " + x);
    }
}
