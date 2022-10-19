package intec.brussel;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array6 {
    public static void main(String[] args) {

        Random random = new Random();
        int[] arr01 = new int[2];
        int[] arr02 = new int[2];
        int[] arr03 = new int[2];
        int[] arr04 = new int[2];
        int sum01 = 0, sum02 = 0, sum03 = 0, sum04 = 0;
        for (int i = 0; i < 2; i++) {
            arr01[i] = random.nextInt(22) + 1;
            sum01 += arr01[i];
            arr02[i] = random.nextInt(22) + 1;
            sum02 += arr02[i];
            arr03[i] = random.nextInt(22) + 1;
            sum03 += arr03[i];
            arr04[i] = random.nextInt(22) + 1;
            sum04 += arr04[i];
        }
        System.out.println("Array 01: " + Arrays.toString(arr01));
        System.out.println("Array 02: " + Arrays.toString(arr02));
        System.out.println("Array 03: " + Arrays.toString(arr03));
        System.out.println("Array 04: " + Arrays.toString(arr04));

        int[] arraySum01 = {sum01};
        int[] arraySum02 = {sum02};
        int[] arraySum03 = {sum03};
        int[] arraySum04 = {sum04};

        Arrays.sort(arraySum01);

        for (int i = arraySum01.length - 1; i >= 0; i--) {
            if (arraySum01[i] <= 23) {
                System.out.println("\tDealer wins: " + arraySum01[i] + " with final points");
            } else {
                System.out.println("\tDealer losed: " + arraySum01[i] + " with final points");
            }
        }

        Arrays.sort(arraySum02);

        for (int j = arraySum02.length - 1; j >= 0; j--) {
            if (arraySum02[j] <= 23) {
                System.out.println("\tPlayer1 wins: " + arraySum02[j] + " with final points");
            } else {
                System.out.println("\tPlayer1 losed: " + arraySum02[j] + " with final points");
            }

            Arrays.sort(arraySum03);

            for (int k = arraySum03.length - 1; k >= 0; k--) {
                if (arraySum03[k] <= 23) {
                    System.out.println("\tPlayer2 wins: " + arraySum03[k] + " with final points");
                } else {
                    System.out.println("\tPlayer2 losed: " + arraySum03[k] + " with final points");
                }

                Arrays.sort(arraySum04);

                for (int h = arraySum04.length - 1; h >= 0; h--) {
                    if (arraySum04[h] <= 23) {
                        System.out.println("\tPlayer3: " + arraySum04[h] + " with final points");
                    } else {
                        System.out.println("\tPlayer3 losed: " + arraySum04[h] + " with final points");
                    }
                }
            }
        }
    }
}