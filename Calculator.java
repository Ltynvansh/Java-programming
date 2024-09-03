import java.util.*;
public class Calculator {
    public static void main(String args[]){
        System.out.println("Press 1 for add \n Press 2 for sub \n Press 3 for multiplication \n Press 4 for divdide");
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        System.out.println("Enter the two number");
        int a= sc.nextInt();
        int b = sc.nextInt();
        
        switch (button){
            case 1: int sum = a+b;
            System.out.println(sum);
            break;
            case 2: int sub = a-b;
            System.out.println(sub);
            break;
            case 3: int mul = a*b;
            System.out.println(mul);
            break;
            case 4 : if (b == 0){
                System.out.println("Enter a valid input please ");
                break;
            }
            int div = a/b;
            System.out.println(div);
            break;
            default : System.out.println("Please Select a valid Button for calculation");

        }
    }
    
}
