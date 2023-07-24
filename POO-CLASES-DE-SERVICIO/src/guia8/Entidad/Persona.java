/*
Realizar una clase llamada Persona en el paquete de entidades que tengan 
los siguientes atributos: 
nombre, edad, sexo (‘H’ para hombre, ‘M’ para mujer, ‘O’ para otro), peso y altura.
Si desea añadir algún otro atributo, puede hacerlo. Agregar constructores, getters y setters.
 */
package guia8.Entidad;

/**
 *
 * @author Max
 */
public class Persona {
    private String nombre;
    private int edad;
    private String sexo;
    private int peso;
    private float altura;

    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo, int peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }
    
    
    
}
