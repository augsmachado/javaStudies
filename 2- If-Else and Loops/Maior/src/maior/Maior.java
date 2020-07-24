package maior;
import java.util.Scanner;

public class Maior {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int num, maior, menor;
        
        System.out.print("Digite o primeiro valor: ");
        num = e.nextInt();
        maior = num;
        menor = num;
        
        System.out.print("Digite o segundo valor: ");
        num = e.nextInt();
        
        if (num > maior) maior = num;
        if (num < menor) menor = num;
        
        System.out.print("Digite o terceiro valor: ");
        num = e.nextInt();
        
        if (num > maior) maior = num;
        if (num < menor) menor = num;
        
        System.out.printf("Maior: %d\nMenor: %d\n", maior, menor);
    }
    
}
