/*
Las operaciones que se podrán realizar son las siguientes:

Método getDiscriminante(): devuelve el valor del discriminante (double).
El discriminante tiene la siguiente fórmula: (b^2)-4*a*c

Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que
esto ocurra,el discriminante debe ser mayor o igual que 0.

Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para que esto ocurra,
el discriminante debe ser igual que 0.

Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2 posibles soluciones.

Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
Es en el caso en que se tenga una única solución posible.

Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por pantalla las 
posibles soluciones que tiene nuestra ecuación con los métodos obtenerRaices() o obtenerRaiz(), 
según lo que devuelvan nuestros métodos y en caso de no existir solución, se mostrará un mensaje.

Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía el signo delante de -b

 */
package guia8.Servicio;

import guia8.Entidad.Raices;

/**
 *
 * @author Max
 */
public class RaicesServicio {
    
    private double getDiscriminante(Raices r){
        return Math.pow(r.getB(), 2) - 4 * r.getA() * r.getC();
    }
    
    private boolean tieneRaices(Raices r){
        return getDiscriminante(r) > 0;
        //Devuelve true si tiene dos soluciones
    }
    
    private boolean tieneRaiz(Raices r){
        return getDiscriminante(r) == 0;
        //Si devuelve true es porque tiene una unica solucion
    }
    
    private void obtenerRaices(Raices r){
        if(tieneRaices(r)){
            System.out.println("1º raiz: " + (-r.getB() + Math.sqrt((Math.pow(r.getB(), 2))  - (4 * r.getA() * r.getC()))) / (2*r.getA()) );
            System.out.println("2º raiz: " + (-r.getB() - Math.sqrt((Math.pow(r.getB(), 2))  - (4 * r.getA() * r.getC()))) / (2*r.getA()) );
        }
    }
    
    private void obtenerRaiz(Raices r){
        if(tieneRaiz(r)){
            System.out.println("Resultado " + (-r.getB() + Math.sqrt((Math.pow(r.getB(), 2))  - (4 * r.getA() * r.getC()))) / (2*r.getA()) );
        }
    }
    
    public void calcular(Raices r){
        System.out.println("-" + r.getB() + " ± √(("+ r.getB() + "^2) - (4 * " + r.getA() + " * " + r.getC() + "))");
        System.out.println("______________________________");
        System.out.println("            2 * " + r.getA() );
        System.out.println("");
        if(tieneRaices(r)){
            obtenerRaices(r);
        }else if(tieneRaiz(r)){
            obtenerRaiz(r);
        }else{
            System.out.println("No tiene solucion");
        }
    }
}
