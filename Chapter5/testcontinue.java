public class testcontinue {
    public static void main(String[] args) {
        int sum = 0;
        int number = 0 ;
         
        while (number < 20){
            number ++;
            if(number==9 || number ==11){
                continue;
            }
            sum += number;
            System.out.println(number);
            
            }
            System.out.println("The number is "+number);
            System.out.println("The sum is "+sum);
        }
    }
    

