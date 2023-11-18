
package stringentero;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class String_entero {


    public static void main(String[] args) {
        List<String> palabras = Arrays.asList("Vaca", "Toby", "Programación", "Java", "Inconstitucionalidad");
        String resultado = concatenarPalabras(palabras, 4);
        System.out.println(resultado);
    }

    public static String concatenarPalabras(List<String> lista, int n) {
        return lista.stream()
                    .filter(palabra -> palabra.length() > n)
                    .collect(Collectors.joining(", "));
    }
    
    
}
