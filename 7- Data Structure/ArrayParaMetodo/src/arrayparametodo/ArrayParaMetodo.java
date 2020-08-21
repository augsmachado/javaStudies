package arrayparametodo;
import java.util.Scanner;

public class ArrayParaMetodo {

    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        
        Scanner e = new Scanner(System.in);
        System.out.println("Matriz M[3][3]\n");
        
        for(int linha = 0; linha <matriz.length; linha++){
            for(int coluna = 0; coluna < matriz.length; coluna++){
                System.out.printf("Insira o elemento M[%d][%d]: ", linha +1, coluna +1);
                matriz[linha][coluna] = e.nextInt();
            }
        }
        
        exibeMatriz(matriz);
    }
    
    public static void exibeMatriz(int[][] mat) {
        System.out.println("Imprimindo matriz");
        for(int linha = 0; linha <mat.length; linha++){
            for(int coluna = 0; coluna <mat.length; coluna++){
                System.out.printf("\t %d \t", mat[linha][coluna]);
            }
            System.out.println();
        }
    }
    
}
