package primeiraclasse;
import java.util.Scanner;

public class PrimeiraClasse {


    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Scanner e = new Scanner(System.in);
        String nome;
        Double notaMat, notaFis;
        
        // Entrada de dados do aluno
        System.out.print("Nome do aluno: ");
       nome = e.nextLine();
        
        System.out.print("Nota em Matemática: ");
        notaMat = e.nextDouble();
        
        System.out.print("Nota em Física: ");
        notaFis = e.nextDouble();
        
        // Cria objeto do tipo Aluno
        Aluno aluno2 = new Aluno(nome, notaMat, notaFis);
        
        // Exibindo Média
        System.out.printf("O aluno \"%s\" tirou %2.2f em Matemática, "
                + "%2.2f em Física e obteve média %2.2f\n",
                aluno2.nome,
                aluno2.notaMat,
                aluno2.notaFis,
                aluno2.media);
        
    }
    
}
