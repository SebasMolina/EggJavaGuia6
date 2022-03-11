/*
Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para 
leer dos números en forma de cadena. A continuación, utilice el método parseInt() de la 
clase Integer, para convertir las cadenas al tipo int y guardarlas en dos variables de tipo 
int. Por ultimo realizar una división con los dos numeros y mostrar el resultado. 
*/
package sistema;

/**
 *
 * @author Sebas
 */
public class DivisionNumero {
    private int nro1;
    private int nro2;

    public DivisionNumero() {
    }

    public DivisionNumero(int nro1, int nro2) {
        this.nro1 = nro1;
        this.nro2 = nro2;
    }

    public int getNro1() {
        return nro1;
    }

    public void setNro1(int nro1) {
        this.nro1 = nro1;
    }

    public int getNro2() {
        return nro2;
    }

    public void setNro2(int nro2) {
        this.nro2 = nro2;
    }
    
    public double divisionEntreNum(){
        return (double) nro1/nro2;
    }
}
