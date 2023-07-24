/*
Crear clase CafeteraServicio en el paquete Servicios con los siguiente:

Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 

Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño
de la taza y simula la acción de servir la taza con la capacidad indicada. 
Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede.
El método le informará al usuario si se llenó o no la taza, y de no haberse llenado
en cuanto quedó la taza.

Método vaciarCafetera(): pone la cantidad de café actual en cero. 

Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.

 */
package guia8.Servicio;

import guia8.Entidad.Cafetera;

/**
 *
 * @author Max
 */
public class CafeteraServicio {
        
    public void llenarCafetera(Cafetera cafe){
        cafe.setCantidadActual(cafe.getCapacidadMaxima());
    }
    
    public void vaciarCafetera(Cafetera cafe){
        cafe.setCantidadActual(0);
    }
    
    public void servirTaza(Cafetera cafe,int tamañoTaza){
        if(tamañoTaza > cafe.getCantidadActual()){
            System.out.println("La taza no se lleno, quedo en " + cafe.getCantidadActual() + "ml");
            this.vaciarCafetera(cafe);
        }else{
            System.out.println("La taza se lleno");
            cafe.setCantidadActual(cafe.getCantidadActual() - tamañoTaza);
        }
    }
    
    public void agregarCafe(Cafetera cafe,int cantidad){
        if(cantidad + cafe.getCantidadActual() > cafe.getCapacidadMaxima()){
            System.out.println("La cafetera rebalso");
            this.llenarCafetera(cafe);
        }else{
            System.out.println("Cafe agregado");
            cafe.setCantidadActual(cantidad + cafe.getCantidadActual());
            System.out.println("Ahora la cafetera tiene: " + cafe.getCantidadActual() + "ml");
        }
    }
    
}
