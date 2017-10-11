/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.omnilife.paul.controlstructures;

/**
 *
 * @author paul.soberanes
 */
public class While {

    /**
     * Demonstrate the while loop.
     */
    public void loop() {
        int n = 10;
        while (n > 0) {
            System.out.println("tick " + n);
            n--;
        }
    }

    /**
     * The target of a loop can be empty.
     */
    public void bodyEmpty() {
        int i, j;
        i = 100;
        j = 200;
        // find midpoint between i and j
        while (++i < --j) ; // no body in this loop
        System.out.println("Midpoint is " + i);
    }
}
