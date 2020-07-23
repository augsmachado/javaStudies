package aprovadoreprovado;
import java.util.Scanner;

public class AprovadoReprovado {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float mediaFinal;
        
        System.out.print("Digite a média final: ");
        mediaFinal = entrada.nextFloat();
        
        if(mediaFinal <= 5) {
            System.out.println("Reprovado");
        } else if (mediaFinal > 5 && mediaFinal < 7) {
            System.out.println("Tem direito a prova de recuperação");
        } else if (mediaFinal >= 7 && mediaFinal <= 10) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Digite uma nota válida");
        }
    }
    
}
