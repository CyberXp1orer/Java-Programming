public class TEstBreak {
    public static void main(String[] args) {
        /*int sum = 0;
        int number = 0 ;
         
        while (number < 20){
            number ++;
            sum +=number;
            if(sum>=100){
                break;
            }
        }
        System.out.println("number is "+number);
        System.out.println("sum is "+sum);*/
        double tuition =  10000;
        double doubletuition = 10000*2;
        final double increase = 0.07;
        int year=0;
        while(doubletuition>=tuition)
        {
            tuition += tuition*increase;
            year+=1;
        }
        System.out.println("Tuition will be doubled in "+year+"years");
        System.out.printf("Tuition will be %.2f in %d years", tuition, year);

    }
    
}
 