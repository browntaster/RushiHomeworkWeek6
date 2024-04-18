package week7HW;

public class Week7Q26 {
    public static void main(String[] args) {
        String str = "Rushi";
        String result = " ";

        for (int i=str.length()-1; i>=0; i--)
        {
            result = result+str.charAt(i);
        }
        System.out.println(result);
    }
}
