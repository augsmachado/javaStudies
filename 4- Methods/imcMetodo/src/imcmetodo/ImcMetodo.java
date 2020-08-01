package imcmetodo;
import java.util.Scanner;

public class ImcMetodo {
    
        public static void main(String[] args) {
        float peso, altura;
        Scanner e = new Scanner(System.in);
        
        System.out.print("Entre com seu peso em kilos: ");
        peso = e.nextFloat();
        
        System.out.print("Entre com sua altura em metros: ");
        altura = e.nextFloat();
        
        System.out.printf("Seu IMC vale: %.2f\n", imc(peso, altura));
    }
    
    public static float quadrado(float num) {
        return num * num;
    }
    
    public static float imc(float peso, float altura) {
        return (peso / quadrado(altura));
    }
}
