import java.io.IOException;
import java.util.Scanner;


public class Main {
    
     public static void main(String[] args) throws IOException {
       int A;   
       int B;
       
       Scanner sc = new Scanner(System.in);
       
        System.out.printf("A: ");
        A = sc.nextInt();
        
        System.out.printf("B: ");
        B = sc.nextInt();
        
        System.out.println("X = " + (A + B));
      
    }
    
}
