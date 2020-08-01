package epositivo;
import java.util.Scanner;

public class EPositivo {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        
        System.out.print("Digite o numero desejado: ");
        float num = e.nextFloat();
        
        if(isPositive(num) == true) {
            System.out.printf("%.2f é positivo\n", num);
        } else {
            System.out.printf("%.2f é negativo\n", num);
        }
    }
    
    public static boolean isPositive(float num) {
        return num >=0;
    }
}
