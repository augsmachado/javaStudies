package menor;
import java.util.Scanner;

public class Menor {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int num1, num2;
        
        // Entrada dos números
        System.out.print("Digite o 1 valor: ");
        num1 = e.nextInt();
        
        System.out.print("Digite o 2 valor: ");
        num2 = e.nextInt();
        
        System.out.println("O menor valor é: " +menor(num1, num2));
    }
    
    public static int menor(int a, int b) {
        if (a < b)
            return a;
        else
            return b;
    }
}
