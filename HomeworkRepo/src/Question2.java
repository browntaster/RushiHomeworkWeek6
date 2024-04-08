public class Question2 {
    /* 2.1 Declare two static variables.
2.2 Declare one static method.
2.3 Call both static variables into the static method inside the print statement.
2.4 Declare the Main method.
2.5 Call the static method into the Main method and run the programme.

     */
    String department = "Mechanical Engineering";
    static int percentage = 78;

    public static void main(String[] args) {
        Question2 r = new Question2();

        System.out.println(r.department+" passing with "+percentage);
    }
}
