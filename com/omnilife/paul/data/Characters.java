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
public class Characters {

    /**
     * Demostrate char data type.
     *
     * @author paul.soberanes
     */
    public void chars() {
        char ch1, ch2;

        ch1 = 88; // code for x
        ch2 = 'Y';

        System.out.print("ch1 and ch2: ");
        System.out.println(ch1 + " " + ch2);
    }

    /**
     * Char variblaes behave like integers.
     *
     * @author paul.soberanes
     */
    public void charLikeInteger() {
        char ch1;

        ch1 = 'X';
        System.out.println("chi1 contains " + ch1);
        
        ch1++; // increment ch1
        System.out.println("ch1 is now " + ch1);
    }
}
