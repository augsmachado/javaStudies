package raizes;
import java.util.Scanner;

public class Raizes {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        float a, b, c;
        
        // Entrada dos coeficientes
        System.out.printf("Digite o valor de A: ");
        a = e.nextFloat();
        
        System.out.printf("Digite o valor de B: ");
        b = e.nextFloat();
        
        System.out.printf("Digite o valor de C: ");
        c = e.nextFloat();
        
        // Para a eq. existir, A deve ser diferente de zero
        if (isZero(a) == false) {
            raizes(a, b, c);
        } else {
            System.out.println("Não é uma equação de 2 grau");
        }
    }
    
    // Verifica se A é nulo
    public static boolean isZero(float a) {
        return a == 0;
    }
    
    // Verifica se Delta é positivo
    public static boolean isPositive(float delta){
        return delta >= 0;
    }
    
    // Calcula o valor do Delta
    public static float delta(float a, float b, float c) {
        return (float) Math.pow(b, 2) - (4 *a *c);
    }
    
    // Calcula as raízes
    public static void raizes(float a, float b, float c){
        
        System.out.println("As raízes são:");
        if(isPositive(delta(a, b, c)) == true) {
            System.out.printf("x1: %.2f\n", (-b + Math.sqrt(delta(a, b, c)) / 2 * a));
            System.out.printf("x2: %.2f\n", (-b - Math.sqrt(delta(a, b,c)) / 2 *a));
        } else {
            System.out.printf("x1: %.2f + %.2fi\n", (-b)/(2*a), (Math.sqrt(-(delta(a, b, c))))/(2*a));
            System.out.printf("x2: %.2f - %.2fi\n", (-b)/(2*a), (Math.sqrt(-(delta(a, b, c))))/(2*a));
        }
    }
}
