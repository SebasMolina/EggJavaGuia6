/*
Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para 
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo 
fuera de rango).
*/
package sistema;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Sebas
 */
public class Sistema {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        Persona unaPersona = new Persona();
        try{
            System.out.print("Ingrese la cantidad: ");
            int cantidad = leer.nextInt();
            String[] unosHijos = new String[cantidad];
            unaPersona.definirCantidad(cantidad);
            for (int i=0;i<5;i++){
                System.out.print("Ingrese el nombre del hijo: ");
                unosHijos[i]= leer.next();
            }
            unaPersona.setHijos(unosHijos);
            System.out.println("Correcto");    
        } catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Hubo un error al ingresar los datos");
        } catch (InputMismatchException exception){
            System.out.println("Coloco una letra en vez de numero");
        }
            
    }
    
}
