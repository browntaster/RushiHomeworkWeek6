package week7HW;

public class Week7Q21 {
    public static void main(String[] args) {
        int [] number = {2, 8, 9, 9, 5};
        int sum = 0;

        for (int i=0; i<5; i++)
        {
            sum = sum + number[i];
        }
        System.out.println("Sum Value Of an Array: " + sum);
    }
}
