/*
Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
Método para crear cuenta pidiéndole los datos al usuario.

Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.

Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual.
Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar
la cuenta en 0.

Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no 
saque más del 20%.

Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.

Método consultarDatos: permitirá mostrar todos los datos de la cuenta.

 */
package guia8.Servicio;

import guia8.Entidad.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author Max
 */
public class CuentaBancariaServicio {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public CuentaBancaria crearCuenta(){
        
        System.out.println("Introducir nro de cuenta");
        int numeroCta = leer.nextInt();
        System.out.println("Introducir DNI");
        long dni = leer.nextLong();
        System.out.println("Introducir saldo actual");
        float saldoAc = leer.nextFloat();
        
        return new CuentaBancaria(numeroCta, dni, saldoAc);
    }
    
    public double ingresarDinero (CuentaBancaria cb, double ingreso){
        cb.setSaldoActual(cb.getSaldoActual() + ingreso);
        System.out.println("Ingreso exitoso");
        return cb.getSaldoActual();
    }
    
    public double retirarDinero (CuentaBancaria cb, double retiro){
        if (retiro > cb.getSaldoActual()){
            System.out.println("Esta intentando retirar mas de lo que posee en su cuenta");
            System.out.println("Retirando el total de su cuenta: $" + cb.getSaldoActual());
            cb.setSaldoActual(0);
        }else{
            cb.setSaldoActual(cb.getSaldoActual() - retiro);
        }
        return cb.getSaldoActual();
    }
    
    public double extraccionRapida(CuentaBancaria cb){
        if (cb.getSaldoActual() < 20){
            System.out.println("Usted no tiene fondos suficientes para realizar la operacion solicitada");
        }else{
            System.out.println("$" + cb.getSaldoActual()*0.2 + " extraidos");
            cb.setSaldoActual(cb.getSaldoActual()-(cb.getSaldoActual()*0.2));
        }
        return cb.getSaldoActual();
    }
    
    public void consultarSaldo(CuentaBancaria cb){
        System.out.println("Usted dispone de $" + cb.getSaldoActual());
    }
    
    public void consultarDatos(CuentaBancaria cb){
        System.out.println("Nro de cuenta: " + cb.getNumeroCuenta() + "\n DNI: " + cb.getDniCliente() + "\n Saldo actual: $" + cb.getSaldoActual());
    }
}
