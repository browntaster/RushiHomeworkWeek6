public class Q17 {
    String city = "Toronto";
    static String country = "Canada";

    public static void main(String[] args) {
        Q17 n = new Q17();
        n.origin();
        name();

    }

    public void origin() {
        System.out.println(country);
    }

    public static void name() {
        Q17 n = new Q17();

        System.out.println(n.city);
    }
}
