/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.omnilife.paul.data;

/**
 * Class to explain Integer Data Type
 *
 * @author paul.soberanes
 */
public class Integers {

    public void dataTypes() {
        // Declares byte variables.
        byte b, c;
        // Declares short variables.
        short s;
        short t;
        // Declares int variables.
        int x = 1, y;
        // Declares long variables.
        long days;
    }

    /**
     * Compute distance light travels using long variables.
     *
     * @author paul.soberanes
     */
    public void lightDistance() {
        int lightspeed;
        long days;
        long seconds;
        long distance;

        // approximate speed of light in miles per second.
        lightspeed = 186000;
        days = 1000; // specify number of days
        seconds = days * 24 * 60 * 60; // convert to seconds
        distance = lightspeed * seconds; // compute distance

        System.out.print("In " + days);
        System.out.print(" days light will travel about ");
        System.out.print(distance + " miles");
    }
}
