package org.example;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.math.BigDecimal;
import java.util.Stack;

public class test_ej56 {
    @Test
    public void testSumaRecursivaElementosPila() {
        Stack pila = new Stack();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);
        pila.push(6);
        pila.push(7);
        assertEquals(new BigDecimal(28), ejercicio56.sumaRecursivaElementosPila(pila));
    }
    @Test
    void testSumaRecursivaElementosPila0() {
        Stack pila = new Stack();
        assertEquals(BigDecimal.ZERO, ejercicio56.sumaRecursivaElementosPila(pila));
    }
}
