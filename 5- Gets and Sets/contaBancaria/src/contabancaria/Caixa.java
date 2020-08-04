package contabancaria;

import java.util.Scanner;
import java.util.Random;

public class Caixa {
    public static void main(String[] args) {
        // Declarando as variaáveis, Scanner e Random
        String nome;
        double inicial;
        Scanner e = new Scanner(System.in);
        Random num = new Random();
        int conta = 1 + num.nextInt(9999);
        
        // Obtendo os dados iniciais do Cliente
        System.out.println("Cadastrando novo Cliente");
        System.out.print("\nEntre com seu nome: ");
        nome = e.nextLine();
        
        System.out.print("\nEntre com o valor inicial depositado na conta: ");
        inicial = e.nextDouble();
        
        // Criando a conta de um cliente
        ContaBancaria minhaConta;
        minhaConta = new ContaBancaria(nome, conta, inicial);
        minhaConta.iniciar();
    }
}
