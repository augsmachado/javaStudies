package operacoes;

import java.util.Scanner;

public class Operacoes {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2;
        
        // Entrada dos valores
        System.out.print("Digite o primeiro número: ");
        num1 = entrada.nextInt();
        
        System.out.print("Digite o segundo número: ");
        num2 = entrada.nextInt();
        
        System.out.println();
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " / " + num2 + " = " + (float)((float)num1 / (float)num2));
        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
    }
    
}
