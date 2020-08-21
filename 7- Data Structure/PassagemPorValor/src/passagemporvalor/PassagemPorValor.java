package passagemporvalor;
import javax.swing.JOptionPane;

public class PassagemPorValor {

    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: ").trim());
        
        String resultado = String.format("Valor a ser dobrado: %d\nResultado: %d\n",
                num, dobra(num));
        
        JOptionPane.showMessageDialog(null, resultado);
    }
    
    public static int dobra(int num) {
        return num *2;
    }
}
