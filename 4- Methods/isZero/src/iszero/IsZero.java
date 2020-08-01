package iszero;
import java.util.Scanner;

public class IsZero {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        
        System.out.printf("Digite o número desejado: ");
        float num = e.nextFloat();
        
        if(isZero(num) == true)
            System.out.println(num +" é nulo");
        else
            System.out.println(num +" não é nulo");
    }
    
    public static boolean isZero(float num) {
        return num == 0;
    }
}
