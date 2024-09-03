import java.util.Scanner;
public class twoDimension {
    
    public static void main ( String args []){
        System.out.println("Enter Row and Column");
      
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int a [][] = new int [m] [n];
        //When Two Dimension array we always use Nested loop 
        // Inner loop column  
        // Outer loop Row 
        for (int i= 0; i< m ;i++){
            for (int j =0; j< n ;j++){
                System.out.println("Enter the values");
               
                
                a[i][j] = sc.nextInt();
               
            }
           
             
        }
        for (int i= 0; i< m ;i++){
            for (int j =0; j< n ;j++){
                System.out.print(a[i][j]+" ");
                
               
            }System.out.println(" "); 
        }System.out.println(" ");    
        

    }
    
}
