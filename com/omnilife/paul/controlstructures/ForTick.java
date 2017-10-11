/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.omnilife.paul.controlstructures;

/**
 * Declare a loop control variable inside the for.
 *
 * @author paul.soberanes
 */
public class ForTick {

    public static void main(String args[]) {
        // here, n is declared inside of the for loop
        for (int n = 10; n > 0; n--) {
            System.out.println("tick " + n);
        }
        
        findPrime();
    }

    public static void findPrime() {
        int num;
        boolean isPrime = true;
        num = 14;
        for (int i = 2; i <= num / i; i++) {
            if ((num % i) == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}
