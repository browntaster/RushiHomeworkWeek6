public class Question3 {
    String name = "Rishi";
    static String surname = "Padhiyar";

    public static void main(String[] args) {
        Question3 r = new Question3();
        r.fullname();
        name2();
    }

    //Instance Method
    public void fullname() {
        System.out.println(name);
        System.out.println(surname);
    }

    //Static Method
    public static void name2() {
        System.out.println(surname);

        Question3 p = new Question3();
        System.out.println(p.name);

    }

}
