/*
 * Aluno: Paulo Henrique Lerbach Rodrigues
 * RA: 22051629
 */
package br.com.palerique.ltp2.p1.q1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Matriz {
    private void imprimirMatriz(int[][] matriz) {
        Arrays.stream(matriz)
                .forEach(ints -> {
                    IntStream.range(0, matriz[0].length)
                            .mapToObj(j -> ints[j] + "\t")
                            .forEach(System.out::print);
                    System.out.println();
                });
    }

    public int[][] multiplica(int[][] a, int[][] b) throws Exception {

        //O produto entre duas matrizes A e B é definido se ,
        // e somente se, o número de colunas da matriz A
        // for igual ao numero de linhas da matriz B.
        if (a == null || b == null || a.length == 0 || b.length == 0
                || a[0].length != b.length) {
            throw new Exception("Não foi possível mutiplicar as matrizes");
        }

        int[][] c = new int[a.length][b[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < b.length; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        imprimirMatriz(c);

        return c;
    }
}
