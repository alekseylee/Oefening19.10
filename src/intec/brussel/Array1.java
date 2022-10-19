package intec.brussel;

import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6};
        for (int x = 0; x < numbers.length; x++)
            if (numbers[x] % 2 != 0)
                System.out.print(numbers[x] + ", ");
    }
}
