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
public class BoxDemo4 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        double vol;
        
        // initialize the box
        mybox1.setDim(10, 20, 15);
        
        // get volume of the box
        vol = mybox1.volume();
        
        System.out.println("Volume: " + vol);
    }
}