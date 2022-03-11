package sistema;

/**
 *
 * @author Sebas
 */
public class Persona {
    private String[] hijos ;

    public Persona() {
    }

    public Persona(String[] hijos) {
        this.hijos = hijos;
    }

    public String[] getHijos() {
        return hijos;
    }

    public void setHijos(String[] hijos) {
        this.hijos = hijos;
    }
    
    public void definirCantidad(int cantidad){
        this.hijos = new String[cantidad];
    }

    
    
    
}
