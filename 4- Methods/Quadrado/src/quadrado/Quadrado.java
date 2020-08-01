package quadrado;
import java.util.Scanner;

public class Quadrado {
    
    public static int quadrado(int num) {
        return num * num;
    }
    
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        
        System.out.print("Entre com um inteiro: ");
        int numero = e.nextInt();
        
        System.out.printf("%d elevado ao quadrado é %d\n", numero, quadrado(numero));
    }
}
