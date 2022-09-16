// Input data will give a number of test-cases in the first line.
// Next lines will contain one test-case (i.e. the pair of numbers) each.
// Answer should contain division-and-rounding results for each pair, separated with spaces

// Example:

// input data:
// 3
// 12 8
// 11 -3
// 400 5

// answer:
// 2 -4 80



import java.util.*;

public class solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        for(int i=0; i<n;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            float c = (float)a/(float)b;
            System.out.print(Math.round(c)+" ");
         }
    }
    
}
