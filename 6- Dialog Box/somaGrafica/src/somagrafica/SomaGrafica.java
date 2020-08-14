package somagrafica;
import javax.swing.JOptionPane;

public class SomaGrafica {

    public static void main(String[] args) {
        String valor, resultado;
        int num1, num2;
        
        // .trim() retira os espaços das strings e deixa somente os números
        
        valor = JOptionPane.showInputDialog("Digite o primeiro valor inteiro");
        num1 = Integer.parseInt(valor.trim());
        
        valor = JOptionPane.showInputDialog("Digite o segundo valor inteiro");
        num2 = Integer.parseInt(valor.trim());
        
        resultado = String.format("Resultado: %d", num1 +num2);
        JOptionPane.showMessageDialog(null, resultado);
    }
    
}
