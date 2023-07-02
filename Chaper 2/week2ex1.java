import java.util.Scanner;

public class week2ex1 {
    public static void main(String[] args) {
        System.out.println("Enter the radius and length of a cylinder :");
        Scanner input = new Scanner (System.in);
        double radius = input.nextDouble();
        double length = input.nextDouble();
        //double pi = 3.1415;
        double area = radius * radius * Math.PI;
        double volume = area * length;
        input.close();

    System.out.format("The area is %.4f " , area);
    System.out.format("The volume is %.1f",volume);
    }
}
