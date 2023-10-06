import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class ReadData {
    public static void main(String[] args) throws FileNotFoundException {
        //Create a file instance
        File file = new File("scores.txt");

        //Create s scanner
        Scanner input = new Scanner(file);

        //Read the data form the file
        while(input.hasNext()){
            String firstName = input.next();
            String mi = input.next();
            String lastName = input.next();
            int score = input.nextInt();
            System.out.println(firstName +" "+ mi +" "+ lastName+" "+ score);
        }
        input.close();
    }
    
}
