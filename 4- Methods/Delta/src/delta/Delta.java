package delta;
import java.util.Scanner;

public class Delta {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        float a, b, c;
        
        System.out.printf("Entre com o 1 numero: ");
        a = e.nextFloat();
        
        System.out.printf("Entre com o 2 numero: ");
        b = e.nextFloat();
        
        System.out.printf("Entre com o 3 numero: ");
        c = e.nextFloat();
        
        System.out.println("O valor do Delta é: " +delta(a, b, c));
    }
    
    public static float delta(float a, float b, float c) {
        return (float) Math.pow(b, 2) - (4 *a *c);
    }
}
