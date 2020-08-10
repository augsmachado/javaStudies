/*
O seguinte código cria uma classe bem simples, a "StaticTeste" que simplesmente
informa quando o objeto é criado - através do método construtor padrão main - e
incrementa a variável 'total', que vai guardar a informação do número total de
objetos/carros criados em sua aplicação.
*/

package carro;

public class StaticTeste {

    public static void main(String[] args) {
        Carro fusca = new Carro();
        Carro ferrari = new Carro();
        Carro jipe = new Carro();
    }
    
}
