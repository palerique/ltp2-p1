/*
 * Aluno: Paulo Henrique Lerbach Rodrigues
 * RA: 22051629
 */
package br.com.palerique.ltp2.p1.q2;

/**
 * 2. (2,5 pontos) Crie um classe chamada Fatorial que conterá o método público soma que receberá o
 * parâmetro n. Onde n é qualquer, inteiro e positivo.
 * (1,5 ponto) No método soma calcule e retorne a seguinte soma:
 * <p>
 * E = 1 + (1/2!) +  (1/3!) + ... +  (1/N!)
 * <p>
 * Obs.: N! = 1 x 2 x 3 x 4 x .... x N
 * OBS: 0! = 1 (fatorial do número zero é igual a 1 por definição).
 * (1,0 ponto) Além disso, não deve ser permitido que seja calculado o fatorial de número negativo, pois isso
 * não existe. Portanto lance uma exceção Exception para quem chamar o método soma da classe Fatorial
 * caso o parâmetro n seja negativo. A mensagem a ser passada na exceção é “Não é possível calcular
 * factorial de número negativo”
 */
public class Fatorial {

    public double soma(int n) throws Exception {

        if(n < 0){
            throw new Exception("Não é possível calcular factorial de número negativo");
        }

        double sum = 0;
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
            // Ao inves de calcular o fatorial e depois a soma
            // resolvi fazer tudo no mesmo loop
            // para otimizar o algoritmo!
            sum += 1.0 / fact;
        }

        return sum;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(new Fatorial().soma(5));
    }
}
