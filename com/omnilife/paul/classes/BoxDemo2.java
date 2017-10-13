/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.omnilife.paul.classes;

/**
 *
 * @author Paul Soberanes <paul.soberanes@omnilife.com>
 */
public class BoxDemo2 {

    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        double vol;
        // assign values to mybox1's instance variables
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;
        
        /*  assign different values to mybox2's
            instance variables */
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;
        
        // compute volume of first box
        vol = mybox1.width * mybox1.height * mybox1.depth;
        System.out.println("Volume first box is: " + vol);
        
        // compute volume of second box
        vol = mybox2.width * mybox2.height * mybox2.depth;
        System.out.println("Volume second box is: " + vol);
    }

}
