package bhaskara;
import java.util.Scanner;

public class Bhaskara {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float a, b, c; // Coeficientes
        float delta, sqrtDelta, raiz1,raiz2;
        
        // 1. Entrada dos Coefientes
        System.out.println("Digite uma equação de segundo grau no formato: Ax^2+Bx+C");
        
        System.out.print("Digite A: ");
        a = entrada.nextFloat();
        
        System.out.print("Digite B: ");
        b = entrada.nextFloat();
            
        System.out.print("Digite C: ");
        c = entrada.nextFloat();
        
        // 2. Checa se a entrada é válida
        if (a != 0) {
            
            // 3. Calcula o delta e a raiz quadrada
            delta = (b *b) - (4 *a *c);
            sqrtDelta = (float) Math.sqrt(delta);
            
            // 4. Se Delta >=0, raízes reias
            if (delta >= 0) {
                raiz1 = ((-1)*b + sqrtDelta) / (2 * a);
                raiz2 = ((-1)*b - sqrtDelta) / (2 * a);
            
                System.out.println("Raízes Reais");
                System.out.printf("Raízes: %.2f e %.2f\n", raiz1, raiz2);
            
            // 5. Se Delta < 0, raízes complexas
            } else {
                delta = -delta;
                sqrtDelta = (float) Math.sqrt(delta);
                
                System.out.println("Raízes Complexas");
                System.out.printf("Raíz 1: %.2f + %.2fi\n", (-b)/(2*a), (sqrtDelta)/(2*a));
                System.out.printf("Raíz 2: %.2f - %.2fi\n", (-b)/(2*a), (sqrtDelta)/(2*a));
            }
            
        } else {
            System.out.println("Entrada inválida. Programa finalizado.");
        }
        
    }
    
}
