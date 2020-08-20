package arrayteste;

import javax.swing.JOptionPane;

public class ArrayTeste {

    public static void main(String[] args) {
        float[] numeros = new float[3];
        
        for(int i = 0; i < numeros.length; i++)
            numeros[i] = Float.parseFloat(JOptionPane.showInputDialog("Entre com um numero", i+1).trim());
        
        for(int i = 0; i <numeros.length; i++) {
            String num = String.format("Você digitou: %.2f", numeros[i]);
            JOptionPane.showMessageDialog(null, num);
        }    
    }
}
