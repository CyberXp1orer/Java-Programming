import java.util.Scanner;
    public class computeAreaWithInput {
    public static void main(String[] args) {
        //Create a scanner object 
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for radius : ");

        double radius = input.nextDouble();

        double area = 3.14 * radius * radius;

        System.out.println("The area of radius"+ radius + " is " + area);
    }

    
}
