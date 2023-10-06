import java.util.Scanner;
public class QuotientWithException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two integers");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        
        try{
            int result = Quotient(number1,number2);
            System.out.println(number1 + " / "+ number2 +" is "+result);

        }

        catch(ArithmeticException ex){
            //TPDO: handle exception
            System.out.println("Exception : an integer cannot be divisible by zero");
        }
        input.close();

       // System.out.println("Execution continues......");
    }
    public static int Quotient(int number1,int number2){
        if(number2==0){
            throw new ArithmeticException("Divisor cannot be zero");
        }
        return number1/number2;
    }
    
}