import javax.sound.sampled.SourceDataLine;

import java.net.SocketTimeoutException;
import java.util.Scanner;
public class SalesTax {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter purchase amount :");
        double amount = input.nextDouble();
        double tax = amount * 6/100;
        System.out.println("Sales tax is $"+ (tax*100)/100); 
        input.close();
    }
    
}
