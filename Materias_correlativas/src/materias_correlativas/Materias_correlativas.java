
package materias_correlativas;

import java.util.Arrays;


public class Materias_correlativas {

    
    public static void main(String[] args) {
        // Crear algunas materias
        Materia algoritmos = new Materia(Arrays.asList());
        Materia paradigmas = new Materia(Arrays.asList(algoritmos));
        Materia diseno = new Materia(Arrays.asList(paradigmas));

        // Crear un alumno que ha aprobado Algoritmos y Paradigmas
        Alumno alumno1 = new Alumno(Arrays.asList(algoritmos, paradigmas));

        // Intentar inscribir al alumno en Diseño de Sistemas
        Inscripcion inscripcion1 = new Inscripcion(alumno1, diseno);

        // Verificar si la inscripción es válida
        System.out.println("El alumno 1 " + (inscripcion1.aprobada() ? "puede" : "no puede") + " inscribirse en Diseño de Sistemas.");

        // Crear un segundo alumno que solo ha aprobado Algoritmos
        Alumno alumno2 = new Alumno(Arrays.asList(algoritmos));

        // Intentar inscribir al segundo alumno en Diseño de Sistemas
        Inscripcion inscripcion2 = new Inscripcion(alumno2, diseno);

        // Verificar si la inscripción del segundo alumno es válida
        System.out.println("El alumno 2 " + (inscripcion2.aprobada() ? "puede" : "no puede") + " inscribirse en Diseño de Sistemas, porque reprobo la materia Paradigmas!!.");
    
    }
  }
    

