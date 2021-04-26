package br.com.palerique.ltp2.p1.q1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrizTest {

    @Test
    void multiplica1() throws Exception {
        testarMultiplicacao(new int[][]{{1}}, new int[][]{{2}}, new int[][]{{2}});
        testarMultiplicacao(new int[][]{{1}, {2}}, new int[][]{{3, 4}}, new int[][]{{3, 4}, {6, 8}});
    }

    @Test
    void shouldThrowException() {
        try {
            testarMultiplicacao(new int[][]{{1, 2}}, new int[][]{{3}}, new int[][]{{2}});
            fail("Deveria Lancar Excecao");
        } catch (Exception e) {
            assertEquals("Não foi possível mutiplicar as matrizes", e.getMessage());
        }
    }

    private void testarMultiplicacao(int[][] a, int[][] b, int[][] esperado) throws Exception {
        assertArrayEquals(esperado, new Matriz().multiplica(a, b));
    }
}
