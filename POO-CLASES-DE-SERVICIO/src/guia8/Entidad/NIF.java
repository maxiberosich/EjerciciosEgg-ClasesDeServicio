/*
Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs con 
su correspondiente letra (NIF).
Los atributos serán el número de DNI (entero largo) y la letra (String o char)
que le corresponde. 
 */
package guia8.Entidad;

/**
 *
 * @author Max
 */
public class NIF {
    private long DNI;
    private char[] letra = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'}; 

    public NIF() {
    }

    public NIF(long DNI) {
        this.DNI = DNI;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public char getLetra(int i) {
        return letra[i];
    }
    
}
