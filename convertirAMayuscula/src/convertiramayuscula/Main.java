
package convertiramayuscula;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Main {

 public static void main(String[] args) {
        List<String> palabras = Arrays.asList("Argentina", "0", "Uruguay", "2");
        List<String> palabrasMayusculas = convertirAMayusculas(palabras);
        palabrasMayusculas.forEach(System.out::println);
    }

    public static List<String> convertirAMayusculas(List<String> lista) {
        return lista.stream()
                    .map(String::toUpperCase)
                    .collect(Collectors.toList());
    }

    
}
