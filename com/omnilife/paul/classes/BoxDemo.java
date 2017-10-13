/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.omnilife.paul.classes;

/**
 * This class declares an object of type Box.
 *
 * @author Paul Soberanes <paul.soberanes@omnilife.com>
 */
class BoxDemo {

    public static void main(String args[]) {
        Box mybox = new Box();
        double vol;

        // assign values to mybox's instance variables
        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;

        // compute volume of box
        vol = mybox.width * mybox.height * mybox.depth;
        
        System.out.println("Volume is " + vol);
    }
}
