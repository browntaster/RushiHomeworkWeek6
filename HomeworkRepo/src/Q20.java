public class Q20 {

    String name1 = "Spain";
    static String name2 = "United Kingdom";

    public static void main(String[] args) {
        Q20 l = new Q20();
        l.homeCountry();
        holidays();

    }

    public void homeCountry() {
        System.out.println(name1);
        System.out.println(name2);
    }

    public static void holidays() {

        Q20 r = new Q20();
        System.out.println(r.name1);
        System.out.println(name2);
    }
}
