  
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        
        double A, B, MEDIA;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a nota A:  ");
        A = sc.nextDouble();
        System.out.print("Digite a nota B:  ");
        B = sc.nextDouble();
        
        MEDIA = (A*3.5) + (B*7.5);
        MEDIA = MEDIA / 11;
        
        System.out.printf("MEDIA = %.5f", MEDIA);

    }
}
