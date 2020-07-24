package raio;

import java.util.Scanner;

public class Raio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float raio;
        
        System.out.print("Digite o valor do raio: ");
        raio = entrada.nextFloat();
        
        // Diâmetro
        System.out.println("Diâmetro: " + (2 * raio));
        
        // Comprimento
        System.out.println("Comprimento: " + (2 * raio * Math.PI));
        
        // Área do círculo
        System.out.println("Área: " + (Math.PI * (raio * raio)));
    }
    
}
