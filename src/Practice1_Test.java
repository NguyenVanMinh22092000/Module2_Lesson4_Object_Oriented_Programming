import java.util.Scanner;

public class Practice1_Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width of the your rectangle");
        double width = sc.nextDouble();
        System.out.println("Enter the height of the your rectangle");
        double height = sc.nextDouble();
        Practice1_Triangle rectangle1 = new Practice1_Triangle(width, height);
        System.out.println("the area of your rectangle is " + rectangle1.getArea());
        System.out.println("the perimeter of your rectangle is " + rectangle1.getPerimeter());
        System.out.println("the information of your rectangle are " + rectangle1.display());
    }
}