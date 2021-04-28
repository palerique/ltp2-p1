/*
 * Aluno: Paulo Henrique Lerbach Rodrigues
 * RA: 22051629
 */
package br.com.palerique.ltp2.p1.q4;

/**
 * 4. (2,5 Pontos) Crie uma classe chamada Produto que tenha os atributos:
 * • codigo - O código de um produto comprado, supondo que a digitação do código do produto seja sempre
 * válida, ou seja, um número inteiro entre 1 e 10;
 * • peso - O peso do produto em quilos;
 * • codigoPais - O código do país de origem, supondo que a digitação do código do país seja sempre
 * válida, ou seja, um número entre 1 e 3. Tabelas:
 * <p>
 * <p>
 * +--------------------------+---------+
 * | Codigo do pais de origem | Imposto |
 * +--------------------------+---------+
 * |                        1 | 0%      |
 * |                        2 | 15%     |
 * |                        3 | 25%     |
 * +--------------------------+---------+
 * <p>
 * <p>
 * +-------------------+-----------------+
 * | Codigo do produto | Preco por grama |
 * +-------------------+-----------------+
 * | 1 a 4             |              10 |
 * | 5 a 7             |              25 |
 * | 8 a 10            |              35 |
 * +-------------------+-----------------+
 * <p>
 * <p>
 * Crie os métodos públicos abaixo que retornem:
 * • (0,25 pontos) gramas - O peso do produto convertido em gramas;
 * • (0,25 pontos) precoTotal - O preço total do produto comprado sem o imposto;
 * • (0,25 pontos) imposto - O valor do imposto, sabendo-se que o imposto é cobrado sobre o preço total do
 * produto comprado e que depende do país de origem;
 * • (0,25 pontos) valorTotal - O valor total que é o preço total do produto mais imposto.
 */
public class Questao4 {
    public static void main(String[] args) {
        Produto p1 = new Produto(1, 1.0, 1);
        Produto p2 = new Produto(5, 1.5, 2);
        Produto p3 = new Produto(8, 0.5, 3);

        System.out.printf("%s\n", p1);
        System.out.printf("%s\n", p2);
        System.out.printf("%s\n", p3);
    }
}
