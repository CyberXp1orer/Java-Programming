
public class tuitionuni {
    public static void main(String[] args) {
        double tuition = 10000.0;
        double nexttu = 2 * tuition;
        int year = 0;
        while (tuition < nexttu){
            tuition = tuition +(tuition *0.07);
        year ++;
        }
        System.out.println("Tuition will be doubled in "+year+" years");
        System.out.printf("Tutition will be $%.2f in %d years ",tuition,year);

    
    }
    
}
