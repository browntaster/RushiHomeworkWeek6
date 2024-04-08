public class Q18 {

    static String council = "City Of Regina";
    int house = 4303;

    public static void main(String[] args) {
        Q18 n = new Q18();
        n.borough();
        adress();
    }

    public void borough() {
        System.out.println(council);
        System.out.println(house);
    }

    public static void adress() {
        Q18 r = new Q18();
        System.out.println(council);
        System.out.println(r.house);

    }
}
