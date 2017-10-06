/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.omnilife.paul.main;

import com.omnilife.paul.controlstructures.IfSimple;
import com.omnilife.paul.controlstructures.ForTest;

/**
 *
 * @author paul.soberanes
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num; // this declares a variable called num
        num = 100; // this assigns num the value 100
        System.out.println("This is num: " + num);
        
        num = num * 2;
        System.out.println("The value of num * 2 is ");
        System.out.println(num);
        
        IfSimple controls = new IfSimple();
        controls.compare();
        
        ForTest loop = new ForTest();
        loop.execute();
    }

}
