package mensagem;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Mensagem {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        
        System.out.print("Digite a mensagem a ser exibida na caixa de diálogo: ");
        String mensagem = e.nextLine();
        
        JOptionPane.showMessageDialog(null, mensagem);
    }
    
}
