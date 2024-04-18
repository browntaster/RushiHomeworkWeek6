package week7HW;

public class Week7Q22 {
    public static void main(String[] args) {
        int [] number = {2, 8, 9, 9, 5};
        double sum = 0;

        for (int i=0; i<5; i++)
        {
            sum = sum + number[i];
        }
        System.out.println("Average value of Sum: " + sum/5);
    }
}
