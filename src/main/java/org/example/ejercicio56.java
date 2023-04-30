package org.example;
import java.math.BigDecimal;
import java.util.Stack;

public class ejercicio56 {
    static public BigDecimal sumaRecursivaElementosPila(Stack pila){//complejidad O(n)
        BigDecimal suma = BigDecimal.ZERO;
        if(pila.empty()){
            return BigDecimal.ZERO;
        }else{
         return suma.add((BigDecimal) pila.pop()).add(sumaRecursivaElementosPila(pila));

        }
    }
}
