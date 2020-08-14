package baskaradialogbox;

import javax.swing.JOptionPane;

public class BaskaraDialogBox {

    public static float delta(float a, float b, float c){
        return (b*b - 4*a*c);
    }
    
    public static void main(String[] args){
        String valor, raizes;
        float a=0, b, c,      //coeficientes
        delta,                //delta
        sqrtdelta,            //raiz quadrada de delta
        raiz1,raiz2;          //raízes
        
        //PASSO 1: recebe os coeficientes
        valor = JOptionPane.showInputDialog("Digite o valor de a");
        a = Float.parseFloat(valor.trim());
        
        valor = JOptionPane.showInputDialog("Digite o valor de b");
        b = Float.parseFloat(valor.trim());
        
        valor = JOptionPane.showInputDialog("Digite o valor de c");
        c = Float.parseFloat(valor.trim());
        
        //PASSO 2: checa se 'a' não é 0
        while(a==0){
            if(a==0){
                valor = JOptionPane.showInputDialog("'a' não pode ser 0. Insira outro valor");
                a = Float.parseFloat(valor.trim());
            }
        }
        
        //PASSO 3: checa se o delta é positivo. Se for, mostra as raízes reais
        if(delta(a,b,c)>=0){
            raiz1 = (-b + (float)Math.sqrt(delta(a,b,c)))/(2*a);
            raiz2 = (-b - (float)Math.sqrt(delta(a,b,c)))/(2*a);
            
            raizes = String.format("As raízes são: %.2f e %.2f", raiz1,raiz2);
            
            JOptionPane.showMessageDialog(null,raizes);
        
        //PASSO 4: caso seja negativo, devemos formatar para a exibição para números complexos    
        } else {
            
            raizes = String.format("As raízes são:\n" +
                    "%.2f + %.2fi\n" +
                    "%.2f - %.2fi",(-b/(2*a)), ( (float)Math.sqrt(-delta(a,b,c) ) / (2*a) )
                                  ,(-b/(2*a)), ( (float)Math.sqrt(-delta(a,b,c) ) / (2*a) )
                                   );
            
            JOptionPane.showMessageDialog(null,raizes);
            
        }
    }
}
