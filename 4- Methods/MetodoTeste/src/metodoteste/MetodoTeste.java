package metodoteste;

public class MetodoTeste {

    public static void main(String[] args) {
        System.out.println("Exibindo a mensagem uma vez");
        mensagem();
        
        System.out.println("Exibindo a mensagem 3 vezes");
        for(int count = 1; count <= 3; count++) {
            mensagem();
        }
    }
    
    public static void mensagem() {
        System.out.println("Curso Java Progressivo");
    }
    
}
