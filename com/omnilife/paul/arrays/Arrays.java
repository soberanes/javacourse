/**
 * Notes about Arrays.
 * An array is a group of like-typed variables that are referred to by a common 
 * name; Arrays of any type can be created and may have one or more dimensions. 
 * A specific element in an array is accessed by its index. Arrays offer a 
 * convenient means of grouping related information.
 *
 * Notes:
 * There is a second form that may be used to declare an array: 
 *      type[ ] var-name;
 * e.g.
 *      int al[] = new int[3];
 *      int[] a2 = new int[3];
 */
package com.omnilife.paul.arrays;

/**
 *
 * @author paul.soberanes
 */
public class Arrays {

    // Unidimensional Arrays
    /**
     * Declaring Arrays
     */
    public void notation() {
        int month_days[];
        month_days = new int[12];
        month_days[0] = 31;
        month_days[1] = 28;
        month_days[2] = 31;
        month_days[3] = 30;
        month_days[4] = 31;
        month_days[5] = 30;
        month_days[6] = 31;
        month_days[7] = 31;
        month_days[8] = 30;
        month_days[9] = 31;
        month_days[10] = 30;
        month_days[11] = 31;
        System.out.println("April has " + month_days[3] + " days.");
    }

    /**
     * An improved version of the previous program.
     */
    public void autoArray() {
        int month_days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println("April has " + month_days[3] + " days.");
    }

    /**
     * Average an array of values.
     */
    public void average() {
        double nums[] = {10.1, 11.2, 12.3, 13.4, 14.5};
        double result = 0;
        int i;

        for (i = 0; i < 5; i++) {
            result = result + nums[i];
        }

        System.out.println("Average is " + result / nums.length);
    }

    // Multidimensional Arrays
    /**
     * Demonstrate a two-dimensional array.
     */
    public void twoDimensionArray() {
        int twoD[][] = new int[4][5];
        int i, j, k = 0;

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++) {
                twoD[i][j] = k;
                k++;
            }
        }

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++) {
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Manually allocate differing size second dimensions.
     */
    public void twoDAgain() {
        int twoD[][] = new int[4][];
        twoD[0] = new int[1];
        twoD[1] = new int[2];
        twoD[2] = new int[3];
        twoD[3] = new int[4];

        int i, j, k = 0;
        for (i = 0; i < 4; i++) {
            for (j = 0; j < i + 1; j++) {
                twoD[i][j] = k;
                k++;
            }
        }

        for (i = 0; i < 4; i++) {
            for (j = 0; j < i + 1; j++) {
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Initialize a two-dimensional array.
     */
    public void matrix() {
        double m[][] = {
            {0 * 0, 1 * 0, 2 * 0, 3 * 0},
            {0 * 1, 1 * 1, 2 * 1, 3 * 1},
            {0 * 2, 1 * 2, 2 * 2, 3 * 2},
            {0 * 3, 1 * 3, 2 * 3, 3 * 3}
        };
        int i, j;

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Demonstrate a three-dimensional array.
     */
    public void threeDMatrix() {
        int threeD[][][] = new int[3][4][5];
        int i, j, k;

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                for (k = 0; k < 5; k++) {
                    threeD[i][j][k] = i * j * k;
                }
            }
        }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                for (k = 0; k < 5; k++) {
                    System.out.print(threeD[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
