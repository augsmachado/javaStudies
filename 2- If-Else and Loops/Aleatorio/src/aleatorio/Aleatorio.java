package aleatorio;

import java.util.Random;
import java.util.Scanner;

public class Aleatorio {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        Random randomGenerator = new Random();
        int aposta;
        
        // Gera um número aleatório
        int num = randomGenerator.nextInt(10) + 1;
        
        // Número par ou impar
        if (num % 2 == 0) System.out.println("Número par");
        else System.out.println("Número ímpar");
        
        if (num < 5) {
            System.out.println("Número menor do que 5");
            
            if ((float)num < 2.5) {
                System.out.println("E menor do que 2.5");
            } else {
                System.out.println("E maior do que 2.5");
            }
        } else if (num > 5) {
            System.out.println("Número maior do que 5");
            
            if ((float)num < 7.5) {
                System.out.println("E menor do que 7.5");
            } else {
                System.out.println("E maior do que 7.5");
            }
        }
        
        // Aposta                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
        System.out.print("o número é: ");
        aposta = e.nextInt();
        
        // Resultado
        if (aposta == num) {
            System.out.println("Você acertou!");
        } else{
            System.out.printf("Você errou! O número era: %d\n", num);
        }
    }
    
}
