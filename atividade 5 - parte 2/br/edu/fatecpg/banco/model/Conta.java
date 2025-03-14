package br.edu.fatecpg.banco.model;

public class Conta {
    private int agencia;
    private int conta;
    private String nomeCliente;
    private double saldo = 0;
    private double limiteChequeEspecial = 500;

    public Conta(int ag, int conta, String nome) {
        this.agencia = ag;
        this.conta = conta;
        this.nomeCliente = nome;
    }

    public void setAgencia(int ag) {
        this.agencia = ag;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public int getConta() {
        return this.conta;
    }

    public void setNome(String nome) {
        if (nome.length() > 2) {
            this.nomeCliente = nome;
        } else {
            System.out.println("Nome Inválido!");
        }
    }

    public String getNome() {
        return this.nomeCliente;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public double getLimiteChequeEspecial() {
        return this.limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limite) {
        this.limiteChequeEspecial = limite;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public double sacar(double valor) {
        double saldoDisponivel = this.saldo + this.limiteChequeEspecial;

        if (valor <= saldoDisponivel) {
            this.saldo -= valor;
            if (this.saldo < 0) {
                this.limiteChequeEspecial += this.saldo;
                this.saldo = 0;
            }
        } else {
            System.out.println("Valor de saque maior que o saldo disponível e limite do cheque especial!");
        }
        return this.saldo;
    }
}