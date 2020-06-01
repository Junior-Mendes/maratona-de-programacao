import java.io.IOException;
import java.util.Scanner;

public class MyClass {
	
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        
      double A = sc.nextDouble();
      double B = sc.nextDouble();
      double C = sc.nextDouble();
      double pi = 3.14159;
      
        double triangulo = (A*C) / 2.0;
        double raio = pi * (C*C);
        double trapezio = ((A + B) / 2 * C);
        double quadrado = (B * B);
        double retangulo = (A * B);
       
        System.out.println(String.format("TRIANGULO: %.3f", triangulo));
        
        System.out.println(String.format("CIRCULO: %.3f", raio));
        
        System.out.println(String.format("TRAPEZIO: %.3f", trapezio));
        
        System.out.println(String.format("QUADRADO: %.3f", quadrado));
        
        System.out.println(String.format("RETANGULO: %.3f", retangulo));  
    }
	
}
