package recebedados;
import javax.swing.JOptionPane;

public class RecebeDados {

    public static void main(String[] args) {
       String nome;
       
       nome = JOptionPane.showInputDialog("Digite sseu nome, caro usuário.");
       nome = String.format(nome +"???\nNossa, que nome feio!\n"
            + "Pelo menos sabe programar em Java!");
       JOptionPane.showMessageDialog(null, nome );
    }
    
}
