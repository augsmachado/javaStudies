package conversortemperatura;

import java.util.Scanner;

public class ConversorTemperatura {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int opcao = menu();
        float temperatura, conversao;
        
        // Temperatura a ser convertida
        System.out.print("Digite a temperatura a ser convertida: ");
        temperatura = e.nextFloat();
        
        // Converter para Celsius (1) ou Farenheit (2)
        switch (opcao) {
            case 1:
                conversao = 5 * ((temperatura - 32) /9);
                System.out.printf("%.2fF são %.2fC\n", temperatura, conversao);
                break;
            case 2:
                conversao = ((9 * temperatura) /5) +32;
                System.out.printf("%.2fC são %.2fF\n", temperatura, conversao);
                break;
            default:
                break;
        }
        
        
    }
    
    public static int menu() {
        Scanner e = new Scanner(System.in);
        System.out.print("Converter temperatura para"
                + "\n1- Farenheit para Celsius"
                + "\n2- Celsius para Farenheit"
                + "\nDigite a opção escolhida: ");
        
        return e.nextInt();
    }
    
}
