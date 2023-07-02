import java.util.Scanner;
 public class week2ex5 {
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the length of the side :");
    double s = input.nextDouble();
    double area = ((3*Math.sqrt(3))/2)* Math.pow(s,2);
    System.out.format("The area of the hexagon is %.4f", area);
    input.close();
 }
    
}
