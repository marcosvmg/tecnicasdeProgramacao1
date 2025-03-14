package br.edu.fatecpg.banco.view;
import br.edu.fatecpg.banco.model.Conta;

public class Main {

    public static void main(String[] args) {
        Conta contaAle = new Conta(1000, 777, "Ale");

        contaAle.depositar(1000);
        System.out.println("Saldo Atual: " + contaAle.getSaldo());
        System.out.println("Limite do Cheque Especial: " + contaAle.getLimiteChequeEspecial());

        contaAle.sacar(1200); 
        System.out.println("Saldo Atual após saque: " + contaAle.getSaldo());
        System.out.println("Limite do Cheque Especial restante: " + contaAle.getLimiteChequeEspecial());

        contaAle.sacar(500); 
        System.out.println("Saldo Atual após tentativa de saque: " + contaAle.getSaldo());
        System.out.println("Limite do Cheque Especial restante: " + contaAle.getLimiteChequeEspecial());
    }
}