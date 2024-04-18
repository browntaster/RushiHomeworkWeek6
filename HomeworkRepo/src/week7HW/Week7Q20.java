package week7HW;

import java.util.Arrays;

public class Week7Q20 {
    public static void main(String[] args) {
        int [] numericArray = {70, 50, 63, 20, 35};
        String [] stringArray = {"Pink", "Red", "Black", "Yellow", "Blue"};

        Arrays.sort(numericArray); // Numeric Array
        Arrays.sort(stringArray); // String Array

        System.out.println("Sorted numeric array: " + Arrays.toString(numericArray)); // Numeric Array
        System.out.println("sorted string array: " + Arrays.toString(stringArray)); // String Array

    }
}
