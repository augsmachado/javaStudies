package imc;
import java.util.Scanner;

public class IMC {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float peso, altura;
        
        // Entrada da altura
        System.out.print("Digite sua altura em centímetros: ");
        altura = (entrada.nextFloat() / 100);
        
        // Entrada do peso
        System.out.print("Digite seu peso em quilos: ");
        peso = entrada.nextFloat();
        
        // Calculo do IMC do usuario
        System.out.printf("IMC = %.1f", (peso / (altura * altura)));
    }
    
}
