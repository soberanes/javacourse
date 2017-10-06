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
public class IfSimple {

    public void compare() {
        int x, y;

        x = 10;
        y = 20;

        if (x < y) {
            System.out.println("x is less than y");
        }

        x = x * 2;
        if (x == y) {
            System.out.println("x now is equal to y");
        }

        x = x * 2;
        if (x > y) {
            System.out.println("x now greater than y");
        }
        
        // this won't display anything
        if (x == y) {
            System.out.println("you won's see this");
        }

    }
}
