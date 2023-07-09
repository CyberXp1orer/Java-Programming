import java.util.Scanner;
public class chp3ex1Lottery {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in);
        System.out.println("Enter your lottery number :");
        int number = input.nextInt();
        int lottery = (int)(Math.random()*99);
        System.out.println("The lottery number is "+lottery);
        if (lottery == number) System.out.println("Exact match: you win $10,000");
        else if (number/10 == lottery%10 && number%10 == lottery/10) System.out.println("Match all digits : you win $3,000");
        else if (number/10 == lottery%10 || number%10 == lottery/10 || number/10 == lottery/10 || number%10 == lottery%10) System.out.println("Match one digit: you win $1,000");
        else System.out.println("Sorry: no match");
        
    }
    
}
