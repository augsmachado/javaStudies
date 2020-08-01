package maior;
import java.util.Scanner;

public class Maior {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int num1, num2;
        
        // entrada dos valores
        System.out.print("Digite o 1 valor: ");
        num1 = e.nextInt();
        
        System.out.print("Digite o 2 valor: ");
        num2 = e.nextInt();
        
        System.out.println("O maior valor é: " +maior(num1, num2));        
    }
    
    public static int maior(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }
    
}
