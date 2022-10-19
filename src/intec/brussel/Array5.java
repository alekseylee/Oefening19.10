package intec.brussel;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Random random = new Random();
        int row, column;

        System.out.println("Choose the number of rows ");
        row = scan.nextInt();
        System.out.println("Choose the number of columns ");
        column = scan.nextInt();

        int[][] array01 = new int[row][column];
        int[][] array02 = new int[row][column];
        int[][] arrayMult = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array01[i][j] = random.nextInt(10);
                array02[i][j] = random.nextInt(10);
                arrayMult[i][j] = array02[i][j] * array01[i][j];
            }
        }
        System.out.println("Array01: " + Arrays.deepToString(array01));
        System.out.println("Array02: " + Arrays.deepToString(array02));
        System.out.println("The multiplication for arrays is: " + Arrays.deepToString(arrayMult));
    }
}

