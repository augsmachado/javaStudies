package returntest;

public class ReturnTest {

    public static int soma() {
        return 1+1;
    }
    public static void main(String[] args) {
        System.out.println("Declarando a variável resSoma e recebendo o método soma()");
        int resSoma = soma();
        System.out.println(resSoma);;
        
        System.out.println("Imprimindo diretamente o resultado do return: " + soma());
        
        System.out.println("Usando em uma soma: 2 +soma () = " +(2 + soma()));
        System.out.println("Usando em um produto: 3 * soma() = " + (3 * soma()));
    }
    
}
