public class ex4 {
    public static void main(String[] args) {
    int one_year = 31536000; //365 days = 31536000 sec
    int population = 312032486;
    int birth = one_year/7;
    int death = one_year/13;
    int immigrant= one_year/45;
  
    int one_year_population = population + birth + immigrant - death;
    int two_year_population = one_year_population + birth + immigrant - death;
    int three_year_population =two_year_population + birth + immigrant - death;
    int four_year_population = three_year_population + birth + immigrant - death;
    int five_year_population=four_year_population + birth + immigrant - death;
System.out.println("One year population is "+one_year_population);
System.out.println("Two year population is "+two_year_population);
System.out.println("Three year population is "+three_year_population);
System.out.println("Four year population is "+four_year_population);
System.out.println("Five year population is "+five_year_population);

    }
    
}
