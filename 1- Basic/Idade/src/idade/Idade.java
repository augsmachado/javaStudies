package idade;

import java.util.Scanner;
import java.util.Calendar;

public class Idade {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        // Pergunta qual o ano o usuário nasceu
        System.out.println("Em qual ano você nasceu?");
        
        // Armazena o ano atual
        Calendar calendario = Calendar.getInstance();
        
        // anoAtual - anoNascimento = idade
        System.out.printf("Você tem " +(calendario.get(Calendar.YEAR)
                - entrada.nextInt()) +"\n");
        
    }
    
}
