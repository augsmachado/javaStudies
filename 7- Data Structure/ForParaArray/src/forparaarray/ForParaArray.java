package forparaarray;
import javax.swing.JOptionPane;

public class ForParaArray {

    public static void main(String[] args) {
        int[] numero = new int[5];
        int soma = 0;
        String resultado;
        
        for(int i = 0; i < numero.length; i++)
            numero[i] = Integer.parseInt(JOptionPane.showInputDialog("Entre com o numero:",
                    i+1).trim());
        
        for(int cont : numero)
            soma += cont;
        
        resultado = String.format("A soma dos números digitados é: %d\n", soma);
        JOptionPane.showMessageDialog(null, resultado);
    }
    
}
