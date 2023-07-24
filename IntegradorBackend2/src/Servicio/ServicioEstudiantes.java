/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import entidad.Estudiantes;

/**
 *
 * @author Max
 */
public class ServicioEstudiantes {
    
    public int promedioTotal(Estudiantes e[]){
        int sum = 0;
        for (int i = 0; i < 8; i++) {
            sum = sum + e[i].getNota();
        }
        return sum / 8;
    }
    
    public Estudiantes[] notaMayorAlPromedio(Estudiantes e[]){
        int cont = 0, totalEstudiantes = 0;
        
        for (int i = 0; i < e.length; i++) {
            if(e[i].getNota() > promedioTotal(e)){
                totalEstudiantes++;
            }
        }
        
        Estudiantes[] promedioMayor = new Estudiantes[totalEstudiantes];
        for (int i = 0; i < 8; i++) {
            if(e[i].getNota() > promedioTotal(e)){
                promedioMayor[cont] = e[i];
                cont++;
            }
        }
        return promedioMayor;
    }
    
    public void mostrarAlumnosPromedioMayor(Estudiantes e[]){
        for (int i = 0; i < e.length; i++) {
            System.out.println(e[i].getNombre() + " " + e[i].getNota());
        }
    }
}
