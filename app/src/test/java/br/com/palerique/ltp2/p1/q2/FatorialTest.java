package br.com.palerique.ltp2.p1.q2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FatorialTest {

    @Test
    void soma() throws Exception {
        assertEquals(1.0, new Fatorial().soma(1));
        assertEquals(1.5, new Fatorial().soma(2));
        assertEquals(1.6666666666666667, new Fatorial().soma(3));
        assertEquals(1.7166666666666668, new Fatorial().soma(5));
        assertEquals(1.7182818261984931, new Fatorial().soma(11));
        assertEquals(1.7182818346494484, new Fatorial().soma(20));
    }

    @Test
    void shouldThrowException() {
        try {
            assertEquals(1.7667, new Fatorial().soma(-1));
            fail("Deveria Lancar Excecao");
        } catch (Exception e) {
            assertEquals("Não é possível calcular factorial de número negativo", e.getMessage());
        }
    }
}
