public class Practice4_Test_Fan {
    public static void main(String[] args) {
        Practice4_Fan fan1 = new Practice4_Fan(34, true, 39, "green");
        Practice4_Fan fan2 = new Practice4_Fan(20, false, 9, "black");

        System.out.println( fan1.toString());
        System.out.println( fan2.toString());
        fan2.setStatus(true);
        System.out.println( fan2.toString());

    }
}
