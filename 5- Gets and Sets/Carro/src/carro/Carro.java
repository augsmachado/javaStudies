package carro;

public class Carro {
    public static int total = 0;
    
    Carro() {
        total++;
        System.out.println("Objeto criado. Existem " +total +" objetos dessa classe");
    }
}
