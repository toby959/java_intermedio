
package transform;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Transform {
 public static List<String> transformarLista(List<String> lista, Transformador transformador) {
        return lista.stream()
                    
                    .map(transformador::transformar)
                
                    .collect(Collectors.toList());
    }
   
    public static void main(String[] args) {
       List<String> lista = Arrays.asList("hola, " + "este es el curso de java intermedio de la UTN.");
        List<String> listaTransformada = transformarLista(lista, String::toUpperCase);
        listaTransformada.forEach(System.out::println);  // Imprime toda la frase 
    }
    
    
}
