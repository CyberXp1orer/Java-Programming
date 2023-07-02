import java.util.Scanner;
 public class week2ex4 {
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the driving distance :");
    Double distance = input.nextDouble();
    System.out.print("Enter miles per gallon :");
    Double miles = input.nextDouble();
    System.out.print("Enter price per gallon :");
    Double gallon = input.nextDouble();
    Double costOfdriving = (distance/miles) * gallon;
    System.out.format("The cost of driving is $ %.2f", costOfdriving);
    input.close();
 }
    
}
