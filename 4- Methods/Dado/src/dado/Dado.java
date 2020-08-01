package dado;
import java.util.Random;

public class Dado {

    public static void main(String[] args) {
        int num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0, num6 = 0;
        int sorteio;
        
        for(int i=1; i<1000000; i++) {
            sorteio = dado();
            
            switch(sorteio) {
                case 1:
                    num1++;
                    break;
                case 2:
                    num2++;
                    break;
                case 3:
                    num3++;
                    break;
                case 4:
                    num4++;
                    break;
                case 5:
                    num5++;
                    break;
                case 6:
                    num6++;
                    break;
            }
        }
        
        // Probabilidades
        System.out.printf("A probabilidade de cair 1: %d por cento\n", ((num1 * 100) /1000000));
        System.out.printf("A probabilidade de cair 2: %d por cento\n", ((num2 * 100) /1000000));
        System.out.printf("A probabilidade de cair 3: %d por cento\n", ((num3 * 100) /1000000));
        System.out.printf("A probabilidade de cair 4: %d por cento\n", ((num4 * 100) /1000000));
        System.out.printf("A probabilidade de cair 5: %d por cento\n", ((num5 * 100) /1000000));
        System.out.printf("A probabilidade de cair 6: %d por cento\n", ((num6 * 100) /1000000));
    }
    
    // Sorteia numeros entre 1 e 6
    public static int dado() {
        Random r = new Random();
        return r.nextInt(6) + 1;
    }
}
