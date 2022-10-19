package intec.brussel;

import java.util.Arrays;

public class Array3 {
    public static void main(String[] args) {
        int[] array = new int[6];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (1 + Math.random()*23);
        }
        Arrays.stream(array).forEach(System.out::println);
    int sum = 0;
    double avgNumber = 0;
    int multi = 1;
   for(int index = 0; index < array.length; index++) {
        sum += array[index];
        avgNumber = sum/ array.length;
        multi = multi * array[index];
    }
        System.out.println("Summary of numbers: " +sum);
        System.out.println("Average numbers: " +avgNumber);
        System.out.println("multiple numbers: " +multi);

   }
}


