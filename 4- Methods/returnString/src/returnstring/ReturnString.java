/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package returnstring;

/**
 *
 * @author augus
 */
public class ReturnString {

    public static String mensagem() {
        return "Curso Java Progressivo";
    }
    
    public static void main(String[] args) {
       System.out.println("Exibindo a mensagem uma vez: " +mensagem());
       
       System.out.println("Exibindo a mensagem 3 vezes:");
       for (int count = 1; count <= 3; count++) {
           System.out.println(mensagem());
       }
    }
    
}
