import java.util.Scanner;

public class Practice2_Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A");
        double a = sc.nextDouble();
        System.out.println("Enter B");
        double b = sc.nextDouble();
        System.out.println("Enter C");
        double c = sc.nextDouble();
        Practice2_QuadraticEquation equation1 = new Practice2_QuadraticEquation(a, b, c);
        equation1.getA();
        equation1.getRoot1();
        equation1.getDelta();
    }
}
