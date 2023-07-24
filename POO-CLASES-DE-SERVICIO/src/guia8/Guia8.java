/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8;

import guia8.Entidad.Cafetera;
import guia8.Entidad.CuentaBancaria;
import guia8.Entidad.Persona;
import guia8.Entidad.Raices;
import guia8.Servicio.CafeteraServicio;
import guia8.Servicio.CuentaBancariaServicio;
import guia8.Servicio.NIFServicio;
import guia8.Servicio.PersonaServicio;
import guia8.Servicio.RaicesServicio;
import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Guia8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //EJERCICIO 1 - CUENTA BANCARIA        
        /*CuentaBancariaServicio cbs = new CuentaBancariaServicio();
        
        CuentaBancaria cb1 = cbs.crearCuenta();
        
        cbs.consultarDatos(cb1);
        System.out.println("Monto a ingresar");
        cbs.ingresarDinero(cb1,leer.nextDouble());
        cbs.consultarSaldo(cb1);
        System.out.println("Monto a retirar");
        cbs.retirarDinero(cb1,leer.nextDouble());
        cbs.consultarSaldo(cb1);
        System.out.println(cbs.extraccionRapida(cb1));
        cbs.consultarDatos(cb1);*/
        
        //EJERCICIO 2 - CAFETERA
        /*Cafetera coffe = new Cafetera(100, 100);
        CafeteraServicio cs = new CafeteraServicio();
        
        cs.servirTaza(coffe,50);
        System.out.println(coffe.getCantidadActual());
        cs.agregarCafe(coffe,15);
        System.out.println(coffe.getCantidadActual());*/
        
        //EJERCICIO 3 - PERSONA
        PersonaServicio ps = new PersonaServicio();
//        byte[] edad = new byte[4];
//        byte[] peso = new byte[4];
//        
        Persona persona = null;
       try{
            ps.esMayorDeEdad(persona);
       }catch(NullPointerException e){
           System.out.println("El objeto es nulo, " + e.fillInStackTrace());
       }
       
        
        /*Persona p1 = ps.crearPersona();
        Persona p2 = ps.crearPersona();
        Persona p3 = ps.crearPersona();
        Persona p4 = ps.crearPersona();
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        
        //PERSONA 1 - EDAD
        if(ps.esMayorDeEdad(p1.getEdad())){
            System.out.println(p1.getNombre() + " es mayor de edad");
            edad[0] = 1;
        }else{
            System.out.println(p1.getNombre() + " es menor de edad");
            edad[0] = 0;
        }
            
        //PERSONA 2 - EDAD
        if(ps.esMayorDeEdad(p2.getEdad())){
            System.out.println(p2.getNombre() + " es mayor de edad");
            edad[1] = 1;
        }else{
            System.out.println(p2.getNombre() + " es menor de edad");
            edad[1] = 0;
        }
        //PERSONA 3 - EDAD
        if(ps.esMayorDeEdad(p3.getEdad())){
            System.out.println(p3.getNombre() + " es mayor de edad");
            edad[2] = 1;
        }else{
            System.out.println(p3.getNombre() + " es menor de edad");
            edad[2] = 0;
        }
        //PERSONA 4 - EDAD
        if(ps.esMayorDeEdad(p4.getEdad())){
            System.out.println(p4.getNombre() + " es mayor de edad");
            edad[3] = 1;
        }else{
            System.out.println(p4.getNombre() + " es menor de edad");
            edad[3] = 0;
        }
        
        //PERSONA 1 - IMC
        switch (ps.calcularIMC(p1)) {
            case -1:
                System.out.println(p1.getNombre() + " debe aumentar de peso, se encuentra por debajo del peso ideal");
                peso[0] = -1;
                break;
            case 0:
                System.out.println(p1.getNombre() + " se encuentra en su peso ideal");
                peso[0] = 0;
                break;
            default:
                System.out.println(p1.getNombre() + " debe perder peso");
                peso[0] = 1;
                break;
        }
        //PERSONA 2 - IMC
        switch (ps.calcularIMC(p2)) {
            case -1:
                System.out.println(p2.getNombre() + " debe aumentar de peso, se encuentra por debajo del peso ideal");
                peso[1] = -1;
                break;
            case 0:
                System.out.println(p2.getNombre() + " se encuentra en su peso ideal");
                peso[1] = 0;
                break;
            default:
                System.out.println(p2.getNombre() + " debe perder peso");
                peso[1] = 1;
                break;
        }
        //PERSONA 3 - IMC
        switch (ps.calcularIMC(p3)) {
            case -1:
                System.out.println(p3.getNombre() + " debe aumentar de peso, se encuentra por debajo del peso ideal");
                peso[2] = -1;
                break;
            case 0:
                System.out.println(p3.getNombre() + " se encuentra en su peso ideal");
                peso[2] = 0;
                break;
            default:
                System.out.println(p3.getNombre() + " debe perder peso");
                peso[2] = 1;
                break;
        }
        //PERSONA 4 - IMC
        switch (ps.calcularIMC(p4)) {
            case -1:
                System.out.println(p4.getNombre() + " debe aumentar de peso, se encuentra por debajo del peso ideal");
                peso[3] = -1;
                break;
            case 0:
                System.out.println(p4.getNombre() + " se encuentra en su peso ideal");
                peso[3] = 0;
                break;
            default:
                System.out.println(p4.getNombre() + " debe perder peso");
                peso[3] = 1;
                break;
        }
        
        //PORCENTAJE DE EDAD
        ps.porcentajeEdad(edad);*/
        
        //PORCENTAJE DE PESO
        
        
        //EJERCICIO EXTRA 1 - RAICES
        /*Raices r1 = new Raices(3,-5,2);
        RaicesServicio rs = new RaicesServicio();
        
        rs.calcular(r1);*/
        
        //EJERCICIO EXTRA 2 - NIF
        /*NIFServicio ns = new NIFServicio();
        System.out.print("Ingresa DNI para conocer tu NIF: ");
        ns.crearNIF(leer.nextInt());
        ns.mostrar();*/
    }
    
}
