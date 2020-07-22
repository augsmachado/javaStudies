package entradadados;

import java.util.Scanner;
import java.util.Calendar;

public class EntradaDados {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       
        // Pergunta a idade e armazena
        System.out.println("Digite sua idade: ");
        
        // Criando um objeto do tipo Calendar, o calendario e armazenando o ano atual
        Calendar calendario = Calendar.getInstance();
        
        // anoAtual - idade = anoNascimento
        System.out.printf("Você nasceu em " +(calendario.get(Calendar.YEAR)
                - entrada.nextInt()) +"\n");
    }
    
}
