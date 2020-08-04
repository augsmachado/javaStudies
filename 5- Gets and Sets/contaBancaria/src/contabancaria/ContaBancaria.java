package contabancaria;
import java.util.Scanner;

public class ContaBancaria {
    private String nome;
    private int conta, saques;
    private double saldo;
    Scanner e = new Scanner(System.in);
    
    public ContaBancaria(String nome, int conta, double saldoInicial) {
        this.nome = nome;
        this.conta = conta;
        saldo = saldoInicial;
        saques = 0;
    }

    public void extrato() {
        System.out.println("\tEXTRATO");
        System.out.println("Nome: " +this.nome);
        System.out.println("Número da conta: " +this.conta);
        System.out.printf("Saldo atual %.2f\n", this.saldo);
        System.out.println("Saques realizados hoje: " +this.saques +"\n");
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            saques++;
            System.out.println("Sacado: " +valor);
            System.out.println("Novo saldo: " +saldo +"\n");
        } else {
            System.out.println("Saldo insuficiente. Faça um deposito!\n");
        }
    }
    
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depositado: " +valor);
        System.out.println("Novo saldo: " +saldo +"\n");
    }
    
    public void iniciar() {
        int opcao;
        
        do {
            exibeMenu();
            opcao = e.nextInt();
            escolherOpcao(opcao);
        } while (opcao != 4);
    }
    
    public void exibeMenu(){
        System.out.println("\t Escolha a opção desejada");
        System.out.println("1- Consultar Extrato");
        System.out.println("2- Sacar");
        System.out.println("3- Depositar");
        System.out.println("4- Sair\n");
        System.out.print("opção: ");
    }
    
    public void escolherOpcao(int opcao) {
        double valor;
        
        switch(opcao) {
            case 1:
                extrato();
                break;
            case 2:
                if (saques < 3) {
                    System.out.print("Quanto deseja sacar: ");
                    valor = e.nextDouble();
                    sacar(valor);
                } else {
                    System.out.println("Limite de saques diários atingido.\n");
                }
                break;
            case 3:
                System.out.print("Quanto deseja depositar: ");
                valor = e.nextDouble();
                depositar(valor);
                break;
            case 4:
                System.out.println("Sistema encerrado");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}
