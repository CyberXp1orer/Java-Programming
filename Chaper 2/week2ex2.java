import java.util.Scanner;
public class week2ex2 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the subtotal and a gratuity rate: ");
     double subtotal = input.nextDouble();
     double gratuity_rate = input.nextDouble();
     double gratuity = (gratuity_rate/100)*subtotal;
     double total = gratuity + subtotal;
     System.out.println("The gratuity is $"+gratuity+" and total is $"+total);
    }
    
}
