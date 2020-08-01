package medias;
import java.util.Scanner;

public class Medias {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        float v1, v2, v3, v4, v5;
        
        System.out.print("Entre com o valor 1: ");
        v1 = e.nextFloat();
        System.out.print("Entre com o valor 2: ");
        v2 = e.nextFloat();
        System.out.print("Entre com o valor 3: ");
        v3 = e.nextFloat();
        System.out.print("Entre com o valor 4: ");
        v4 = e.nextFloat();
        System.out.print("Entre com o valor 5: ");
        v5 = e.nextFloat();
        
        System.out.println("A média dos 5 números é: " +media(v1, v2, v3, v4, v5));
        System.out.println("A média dos 4 números é: " +media(v1, v2, v3, v4));
        System.out.println("A média dos 3 números é: " +media(v1, v2, v3));
        System.out.println("A média dos 2 números é: " +media(v1, v2));
    }
    
    // Passando uma lista de args, de tamanho qualquer, para um método
    public static float media(float... valores) {
        float media = 0;
        
        for(float valor: valores) {
            media += valor;
        }
        
        return media/valores.length;
    }
    
}
