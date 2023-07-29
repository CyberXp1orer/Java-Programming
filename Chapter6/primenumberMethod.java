public class primenumberMethod {
    public static void main(String[] args) {
        System.out.println("THe first 50 primes numbers are \n ");
        printPrimeNumbers(100);
        
    }
    
    // A method to print prime number
    public static void printPrimeNumbers(int numberOfPrimes){
        final int NUMBER_OF_PRIMES_PER_LINE = 10;
        int count = 0;//Count the number of prime numbers
        int number = 2;//A number to be tested for primeness

        while(count<numberOfPrimes){
            //Print the prime number and increase the count

            if (isprime(number)){
                count++;
                if ( count % NUMBER_OF_PRIMES_PER_LINE == 0){
                    System.out.printf("%5d\n",number);
                }
                else{
                    System.out.printf("%5d"+number);
                }
            }
            number++;
        }


    }
    // A method to check whether the number is prime or not
    public static boolean isprime(int number){
        if (number <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        
        for (int divisor = 2; divisor <= number;divisor++){
            if (number % divisor == 0){
                return false;
            }
        }
        return true;
    }
    
}
