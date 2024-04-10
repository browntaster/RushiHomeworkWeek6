public class Q5 {
    int a = 5;
    int b = 10;
    int c = 15;
    int d = 20;


    public static void main(String[] args) {

        Q5 a = new Q5();
        a.calculator();
        calculation();
    }

    public void calculator() {
        System.out.println(a+b);
        System.out.println(c-d);
        System.out.println(a*c);
        System.out.println(d/b);
    }

    public static void calculation() {

        Q5 l = new Q5();
        System.out.println(l.a+l.d);
        System.out.println(l.c-l.b);
        System.out.println(l.a*l.c);
        System.out.println(l.b/l.a);
    }

}
