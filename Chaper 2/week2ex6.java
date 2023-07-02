import java.util.Scanner;
 public class week2ex6 {
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the monthly saving amount :");
    double amount = input.nextDouble();
    double result1 = amount * (1 + 0.00417);
    double result2 = (amount + result1) * (1 + 0.00417);
    double result3 = (amount + result2) * (1 + 0.00417);
    double result4 = (amount + result3) * (1 + 0.00417);
    double result5 = (amount + result4) * (1 + 0.00417);
    double result6 = (amount + result5) * (1 + 0.00417);
    System.out.format("After the sixth month, the account value is $%.2f ",result6);
    input.close();

 }
    
}
