/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BSIT1stSem.finalexampractice;

/**
 *
 * @author mj
 */
public class arrays2d {

    public static void main(String[] args) {

        // 1. DECLARATION & INITIALIZATION BY SIZE
        // Creates a 3-row, 4-column grid initialized to 0
        int[][] grid = new int[3][4];

        // 2. MANUAL ASSIGNMENT
        grid[0][0] = 10; // Top-left corner
        grid[2][3] = 50; // Bottom-right corner

        // 3. INITIALIZATION WITH DATA (Literal)
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // 4. ACCESSING SPECIFIC ELEMENTS
        System.out.println("Value at Row 1, Col 2: " + matrix[1][2]); // Outputs 6

        // 5. ITERATING THROUGH A 2D ARRAY
        System.out.println("\n--- Matrix Contents ---");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + "\t");
            }
            System.out.println(); // New line after each row
        }

        // 6. JAGGED ARRAYS (Rows of different lengths)
        System.out.println("\n--- Jagged Array Demo ---");
        int[][] jagged = new int[3][];
        jagged[0] = new int[]{1, 2};
        jagged[1] = new int[]{3, 4, 5, 6};
        jagged[2] = new int[]{7};

        for (int i = 0; i < jagged.length; i++) {
            System.out.println("Row " + i + " length: " + jagged[i].length);
        }
    }
}
