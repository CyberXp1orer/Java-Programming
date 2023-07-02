import java.util.Scanner;
public class week2ex3 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.print("Enter weight in pounds :");
     double weight = input.nextDouble();
     System.out.println("Enter height in inches :");
     double height = input.nextDouble();
     double weightinKG = weight*0.45359237 ;
     double heightinMeter = height*0.0254;
     double BMI = weightinKG/Math.pow(heightinMeter,2);
     input.close();
     System.out.format("BMI is %.4f" , BMI);
    }
    
}
