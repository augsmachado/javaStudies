package alunonotas;
import javax.swing.JOptionPane;

public class AlunoNotas {

    public static void main(String[] args) {
        float[] notas = new float[2];
        float media = 0;
        String nomeAluno, resultado;
        
        nomeAluno = JOptionPane.showInputDialog("Qual o nome do aluno?");
        
        for(int i = 0; i < notas.length; i++) {
            notas[i] = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota", i+1));
            media += notas[i];
        }
        
        resultado = String.format("Nome do aluno: %s\nMedia: %.2f", nomeAluno, media/2);
        JOptionPane.showMessageDialog(null, resultado);
    }
    
}
