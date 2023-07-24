/*
En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al usuario
y después se le asignan a sus respectivos atributos para llenar el objeto Persona.
Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se 
deberá mostrar un mensaje
Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)).
Si esta fórmula da por resultado un valor menor que 20, significa que la persona está por debajo de
su peso ideal y la función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25 
(incluidos), significa que la persona está en su peso ideal y la función devuelve un 0. 
Finalmente, si el resultado de la fórmula es un valor mayor que 25 significa que la persona tiene
sobrepeso, y la función devuelve un 1.

 */
package guia8.Servicio;

import guia8.Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Max
 */
public class PersonaServicio {

    public Persona crearPersona() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Introducir nombre");
        String nombre = leer.nextLine();
        System.out.println("Introducir edad");
        int edad = leer.nextInt();
        String sexo;
        do {
            System.out.println("Sexo \n M - masculino \n F - femenino \n O - otro");
            sexo = leer.next().substring(0, 1).toLowerCase();
            if (!sexo.equals("m") && !sexo.equals("f") && !sexo.equals("o")) {
                System.out.println("Opcion incorrecta, ingrese una opcion predefinida");
            }
        } while (!sexo.equals("m") && !sexo.equals("f") && !sexo.equals("o"));
        System.out.println("Introducir peso");
        int peso = leer.nextInt();
        System.out.println("Introducir altura");
        float altura = leer.nextFloat();
        return new Persona(nombre, edad, sexo, peso, altura);
    }

    public boolean esMayorDeEdad(Persona p) {
        return p.getEdad() > 17;
    }

    public byte calcularIMC(Persona p) {
        if (p.getPeso() / (Math.pow(p.getAltura(), 2)) < 20) {
            return -1;
        } else if (p.getPeso() / (Math.pow(p.getAltura(), 2)) >= 20 && p.getPeso() / Math.pow(p.getAltura(), 2) <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

    public void porcentajeEdad(byte[] e) {
        byte contMenor = 0;
        for (int i = 0; i < 4; i++) {
            if (e[i] == 0) {
                contMenor++;
            }
        }
        System.out.println("El porcentaje de personas menores de edad es " + (contMenor * 25) + "%");
        System.out.println("El porcentaje de personas mayores de edad es " + (contMenor * 25 - 100) + "%");
    }

    public void porcentajePeso(byte[] p) {

    }

}
