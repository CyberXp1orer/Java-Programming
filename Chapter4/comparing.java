public class comparing {
    public static void main(String[] args) {
        String s1 = "Welcome to Java";
        String s2 = "Welcome to Java";
        String s3 = "Welcome to C++";


        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));

        System.out.println(s1.startsWith("WE"));
        System.out.println(s1.startsWith("W"));
        
        System.out.println(s1.endsWith("va"));
        System.out.println(s1.endsWith("v"));

        System.out.println(s1.contains("to"));
        System.out.println(s1.contains("to"));
        

    }
    
}
