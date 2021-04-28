/*
 * Aluno: Paulo Henrique Lerbach Rodrigues
 * RA: 22051629
 */
package br.com.palerique.ltp2.p1.q4;

import java.util.Map;

public class Produto {
    private static final Map<Integer, Double> PRECO_POR_GRAMA = Map.of(
            1, 10.0,
            2, 10.0,
            3, 10.0,
            4, 10.0,
            5, 25.0,
            6, 25.0,
            7, 25.0,
            8, 35.0,
            9, 35.0,
            10, 35.0);
    private static final Map<Integer, Double> IMPOSTO_POR_PAIS = Map.of(
            1, 0.0,
            2, 0.15,
            3, 0.25);

    private final int codigo;
    private final double peso;
    private final int codigoPais;

    public Produto(int codigo, double peso, int codigoPais) {
        this.codigo = codigo;
        this.peso = peso;
        this.codigoPais = codigoPais;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", peso=" + peso +
                ", codigoPais=" + codigoPais +
                ", gramas=" + gramas() +
                ", precoTotal=" + precoTotal() +
                ", imposto=" + imposto() +
                ", valorTotal=" + valorTotal() +
                '}';
    }

    public int getCodigo() {
        return codigo;
    }

    public double getPeso() {
        return peso;
    }

    public double gramas() {
        return peso * 1000.0;
    }

    public double precoTotal() {
        return gramas() * PRECO_POR_GRAMA.get(getCodigo());
    }

    public double imposto() {
        return precoTotal() * IMPOSTO_POR_PAIS.get(codigoPais);
    }

    public double valorTotal() {
        return precoTotal() + imposto();
    }

    public int getCodigoPais() {
        return codigoPais;
    }
}
