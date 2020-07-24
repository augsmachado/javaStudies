package parimpar;
import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int num;
        
        System.out.print("Digite um número: ");
        num = e.nextInt();
        
        if ( num % 2 == 0) {
            System.out.println(num + " é par");
        } else {
            System.out.println(num + " é ímpar");
        }
    }
}
