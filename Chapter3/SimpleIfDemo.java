import java.util.Scanner;
public class SimpleIfDemo {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the integer : ");
    int integer = input.nextInt();
    int a = integer % 5;
    int b = integer % 2;
        if (a == 0) {
            System.out.println("HiEven");}
        if (b == 0){
            System.out.println("HiFive");
        }
    }

    }
    


    