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
public class Box {

    double width;
    double height;
    double depth;
    
    // this is the constructor for Box
    Box(){
        System.out.println("Constructing Box");
        width = 10;
        height = 10;
        depth = 10;
    }

    // display volume of a box
    double volume() {

        return width * height * depth;
    }
}
