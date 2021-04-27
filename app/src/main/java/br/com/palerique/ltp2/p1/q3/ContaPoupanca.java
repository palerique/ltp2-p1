package br.com.palerique.ltp2.p1.q3;

/**
 * No nosso modelo, conta poupança não admite saldo negativo, devendo lançar uma exceção caso isso for ocorrer.
 */
public class ContaPoupanca extends Conta {

    @Override
    public String imprimirSaldo() {
        return "O saldo atual da conta poupança é = " + getSaldo();
    }

    @Override
    public void sacar(double valor) {

        if (getSaldo() - valor < 0) {
            throw new SaldoInsuficienteException("Saldo Insuficiente para efetuar o saque. SALDO = " + getSaldo() + " saque de: " + valor);
        }

        super.sacar(valor);
    }
}
