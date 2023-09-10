
import java.util.Arrays;
import java.util.Collections;
public class ex81computeweeklyhours {
    
    /*public static void main(String[] args) {
        int[][] matrix = getarray();
        int i = 0;
        for (int row = 0; row < matrix.length; row++){
           int totalofrows = 0;
            for(int column = 0; column < matrix[0].length; column++){
                totalofrows += matrix[row][column];
                
            }
            i++;
            System.out.println("Employee " + (i-1) + " works total "+totalofrows+" hours");
        }
    }*/

    public static void main(String[] args) {
        int[][] matrix = getarray();
        int i = 0;
        int[] total = new int[8];
        for (int row = 0; row < matrix.length; row++){
            for(int column = 0; column < matrix[0].length; column++){
                total[row] += matrix[row][column];
            }
        }
            Arrays.sort(total);
            int n=total.length;
            int[] descending = new int[n];
            for(int k=0;k<n;k++){
                descending[k]=total[n-1-k];
            }
            for(int j=0;j<n;j++){
                System.out.println("Employee " + (j) + " works total "+descending[j]+" hours");
            }
    }



    public static int[][] getarray(){
        int[][] matrix = {{2,4,3,4,5,8,8},
                          {7,3,4,3,3,4,4},
                          {3,3,4,3,3,2,2},
                          {9,3,4,7,3,4,1},
                          {3,5,4,3,6,3,8},
                          {3,4,4,6,3,4,4},
                          {3,7,4,8,3,8,4},
                          {6,3,5,9,2,7,9}};
        return matrix;
    }
    
}
