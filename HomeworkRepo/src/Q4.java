public class Q4 {
    String name1 = "Smeet";
    static int age = 23;
    static String name2 ="Dhruvit";
    int age2 = 22;

    public static void main(String[] args) {
        Q4 c = new Q4();

        c.s1();
        s2();
    }

    //instance method

    public void s1() {
        System.out.println("Name "+name1+" and Age is "+age);
        System.out.println(age);
        System.out.println(name2);
        System.out.println(age2);
    }

    //static method

    public static void s2() {

        Q4 r =new Q4();

        System.out.println(r.name1);
        System.out.println(age);
        System.out.println(name2);
        System.out.println(r.age2);
    }

}
