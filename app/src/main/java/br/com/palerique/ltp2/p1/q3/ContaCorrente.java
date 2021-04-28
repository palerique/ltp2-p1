/*
 * Aluno: Paulo Henrique Lerbach Rodrigues
 * RA: 22051629
 */
package br.com.palerique.ltp2.p1.q3;

/**
 * No nosso modelo, contas correntes permitem certo valor de saldo negativo por possuírem uma espécie de Cheque Especial!
 */
public class ContaCorrente extends Conta {

    @Override
    public String imprimirSaldo() {
        return "O saldo atual da conta corrente é = " + getSaldo();
    }
}
