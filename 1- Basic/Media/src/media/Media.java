package media;

import java.util.Scanner;

public class Media {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float somaNotas = 0;
        
        // Nota 1
        System.out.print("Digite a 1a nota: ");
        somaNotas += entrada.nextFloat();
        
        // Nota 2
        System.out.print("Digite a 2a nota: ");
        somaNotas += entrada.nextFloat();
        
        // Nota 3
        System.out.print("Digite a 3a nota: ");
        somaNotas += entrada.nextFloat();
        
        // Media final
        System.out.println(somaNotas +" / 3 = " + (somaNotas/3));
    }
    
}
