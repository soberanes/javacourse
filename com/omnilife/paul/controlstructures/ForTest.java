/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.omnilife.paul.controlstructures;

/**
 * Demonstrate the for loop.
 *
 * @author paul.soberanes
 */
public class ForTest {

    public void execute() {
        int x;

        for (x = 0; x < 10; x++) {
            System.out.println("This is x: " + x);
        }
    }

    /**
     * Use a for-each style for loop.
     */
    public void foreach() {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        // use for-each style for to display and sum the values.
        for (int x : nums) {
            System.out.println("Value is: " + x);
            sum += x;
        }

        System.out.println("Summation is: " + sum);
    }

    /**
     * The for-each loop is essentially read-only.
     */
    public void noChange() {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int x : nums) {
            System.out.print(x + " ");
            x = x * 10; // no effect on nums
        }
        System.out.println();
        for (int x : nums) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    /**
     * Use for-each style for on a two-dimensional array.
     */
    public void foreach3() {
        int sum = 0;
        int nums[][] = new int[3][5];
        // give nums some values
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                nums[i][j] = (i + 1) * (j + 1);
            }
        }

        // use for-each for to display and sum the values
        for (int x[] : nums) {
            for (int y : x) {
                System.out.println("Value is: " + y);
                sum += y;
            }
        }
        System.out.println("Summation: " + sum);
    }

    /**
     * Search an array using for-each style for.
     */
    public void search() {
        int nums[] = {6, 8, 3, 7, 5, 6, 1, 4};
        int val = 75;
        boolean found = false;
        // use for-each style for to search nums for val
        for (int x : nums) {
            if (x == val) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Value found!");
        } else {
            System.out.println("Value not found!");
        }
    }

    /**
     * Loops may be nested.
     */
    public void nested() {
        int i, j;
        
        for (i = 0; i < 10; i++) {
            for (j = i; j < 10; j++) {
                System.out.print(".");
            }
            System.out.println();
        }
    }

}
