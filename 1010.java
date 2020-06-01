import java.io.IOException;
import java.util.Scanner;

public class MyClass {
	
    public static void main(String[] args) throws IOException {
        
     Scanner sc = new Scanner(System.in);
        System.out.println("Digite o código do 1 produto:");
         int cod1 = sc.nextInt();
         System.out.println("Digite o número do 1 produto:");
          int n1 = sc.nextInt();
         System.out.println("Digite o valor do 1 produto:");
         double valor1 = sc.nextDouble();
         System.out.println("Digite o código do 2 produto:");
         int cod2 = sc.nextInt();
         System.out.println("Digite o número do 2 produto:");
         int n2 = sc.nextInt();
         System.out.println("Digite o valor do 2 produto:");
         double valor2 = sc.nextDouble();
         double total = (n1 * valor1) + (n2 * valor2);
         System.out.println(String.format("VALOR A PAGAR: R$ %.2f", total));   
    }
	
}
