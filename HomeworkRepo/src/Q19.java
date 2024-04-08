public class Q19 {

    String name = "Shubham";
    static String name2 = "Janki";

    public static void main(String[] args) {
        Q19 n = new Q19();
        n.we3();
        n.best3();
    }

    public void we3() {

        System.out.println("Member One: "+name);
        System.out.println("Member Two: "+name2);
    }

    public static void best3() {

        Q19 l = new Q19();

        System.out.println("Number 1: "+l.name);
        System.out.println("Number 2: "+name2);
    }
}
