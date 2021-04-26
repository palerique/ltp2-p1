/*
 * Aluno: Paulo Henrique Lerbach Rodrigues
 * RA: 22051629
 */
package br.com.palerique.ltp2.p1.q1;

/**
 * 1. (2,5 Pontos) Crie a classe Matriz em Java e crie o método público multiplica que receberá duas matrizes
 * A e B e retornará a matriz C.
 * (1,5 pontos) O método multiplica é público e realizará a multiplicação das duas matrizes passadas como
 * parâmetro A e B.
 * (1,0 ponto) As dimensões da matriz A e as dimensões de uma matriz B precisam ser validadas se é
 * possível multiplicar as matrizes considerando as dimensões. Caso não seja possível multiplicar você
 * deverá subir uma exceção usando a classe Exception e informando a mensagem “Não é possível
 * multiplicar devido as dimensões das duas matrizes”
 */
public class Questao1 {
    public static void main(String[] args) throws Exception {

        int[][] a = {{1, 1, 1},
                {2, 2, 2},
                {3, 3, 3},
                {4, 4, 4}};

        int[][] b = {{5, 5, 5, 5},
                {6, 6, 6, 6},
                {7, 7, 7, 7}};

        new Matriz().multiplica(a, b);
    }
}
