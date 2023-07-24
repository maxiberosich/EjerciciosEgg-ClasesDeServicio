/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integradorbackend2;

import Servicio.ServicioEstudiantes;
import entidad.Estudiantes;

/**
 *
 * @author Max
 */
public class IntegradorBackend2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiantes[] alumnos = new Estudiantes[8];
        alumnos[0] = new Estudiantes("Juan",2);
        alumnos[1] = new Estudiantes("Juana",7);
        alumnos[2] = new Estudiantes("Maximo",6);
        alumnos[3] = new Estudiantes("Maxima",8);
        alumnos[4] = new Estudiantes("Pedro",8);
        alumnos[5] = new Estudiantes("Pedra",9);
        alumnos[6] = new Estudiantes("Ana",5);
        alumnos[7] = new Estudiantes("Miguel",8);
        
        ServicioEstudiantes sE = new ServicioEstudiantes();
        System.out.println("El promedio total es: " + sE.promedioTotal(alumnos));
        System.out.println("Los alumnos que tienen notas mayor al promedio total son:");
        sE.mostrarAlumnosPromedioMayor(sE.notaMayorAlPromedio(alumnos));
        
    }
    
}
