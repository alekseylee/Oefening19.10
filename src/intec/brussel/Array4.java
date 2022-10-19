package intec.brussel;

import java.util.Scanner;

public class Array4 {

    public static void main(String[] args)
    {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (1 + Math.random()*30);



            Scanner in = new Scanner(System.in);

            boolean correct = false;
            int guess;

            while (!correct) {

                System.out.println("\nGuess a number between 1 and 30: ");

                guess = in.nextInt();

                if (guess > array[i]) {
                    System.out.println("Too high, try again");
                }

                else if (guess < array[i]) {
                    System.out.println("Too low, try again");
                }

                else {
                    System.out.print("\tRandom number is: " + array[i]);
                    System.out.println( "Yes, you guessed the number.");
                    correct = true;
                }
            }
            System.exit(0);
        }
    }
}