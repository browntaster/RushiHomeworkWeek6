package week7HW;

public class Week7Q14 {
    public static void main(String[] args) {
        System.out.println("Number divided by 3: ");
        dividedBy3();

        System.out.println("Number divided by 5: ");
        dividedBy5();
    }

    public static void dividedBy3() {
        for (int i=1; i<100; i++){
            if (i % 3 == 0){
                System.out.println(i +" ");
            }
        }
    }

    public static void dividedBy5(){
        for (int i=1; i<100; i++){
            if (i % 5 == 0){
                System.out.println(i + " ");
            }
        }
    }
}
