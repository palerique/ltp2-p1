/*
 * Aluno: Paulo Henrique Lerbach Rodrigues
 * RA: 22051629
 */
package br.com.palerique.ltp2.p1.q3;

/**
 * Classe abstrata que possui a implementação básica dos métodos usados para movimentar a conta.
 */
public abstract class Conta implements Movimentavel {

    private double saldo = 0;

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public abstract String imprimirSaldo();
}
