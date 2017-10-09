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
public class Floating {
    
    /**
     * Compute circle's area using double variables.
     *
     * @author paul.soberanes
     */
    public void calcutateArea() {
        double pi, r, a;

        r = 10.8; // radious of circle
        pi = 3.1416; // pi, approximately
        a = pi * r * r; // compute area

        System.out.println("Area of circle is " + a);
    }
}
