package br.com.palerique.ltp2.p1.q3;

public class Questao3 {

    public static void main(String[] args) {

        //Polimorfismo 1 - Contas podem ser referenciadas como `Movimentavel`
        Movimentavel movCor = new ContaCorrente();
        Movimentavel movPou = new ContaPoupanca();

        //Polimorfismo 2 - Métodos que recebem `Movimentavel` aceitam objetos ContaCorrente e ContaPoupanca!
        depositar(movPou, 1000.0);
        depositar(movCor, 2000.0);

        //Polimorfismo 2 - Métodos que recebem `Movimentavel` aceitam objetos ContaCorrente e ContaPoupanca!
        sacar(movPou, 150.0);
        sacar(movCor, 100.0);

        //Polimorfismo 3 - `Movimentavel` nao possui o método que imprime o saldo!
        //Mas podemos referenciar esses objetos como Conta (Classe abstrata)
        Conta absCor = (Conta) movCor;
        Conta absPou = (Conta) movPou;

        System.out.println(absCor.imprimirSaldo());
        System.out.println(absPou.imprimirSaldo());

        //Polimorfismo 4 - Os objetos ainda podem ser referenciados usando sua referência mais concreta.
        //A propria classe do objeto.
        ContaCorrente contaCorrente = (ContaCorrente) movCor;
        ContaPoupanca contaPoupanca = (ContaPoupanca) movPou;

        //Aceitável por causa do "cheque especial"
        contaCorrente.sacar(5000.0);

        //Não pode ocorrer o saque.
        try {
            contaPoupanca.sacar(1000.0);
        } catch (SaldoInsuficienteException e) {
            System.err.println(e.getMessage());
        }

        //Saldo deve estar negativo:
        System.out.println(contaCorrente.imprimirSaldo());

        //Saldo deve estar inalterado:
        System.out.println(contaPoupanca.imprimirSaldo());
    }

    /**
     * Para demonstrar outra forma de polimorfismo criei esse metodo que recebe qualquer Movimentavel.
     * Pode ser uma Conta Corrente ou Poupanca.
     */
    private static void depositar(Movimentavel conta, double valor) {
        conta.depositar(valor);
    }

    /**
     * Para demonstrar outra forma de polimorfismo criei esse metodo que recebe qualquer Movimentavel.
     * Pode ser uma Conta Corrente ou Poupanca.
     */
    private static void sacar(Movimentavel conta, double valor) {
        conta.sacar(valor);
    }
}
