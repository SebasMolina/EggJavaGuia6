/*
Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para 
leer dos números en forma de cadena. A continuación, utilice el método parseInt() de la 
clase Integer, para convertir las cadenas al tipo int y guardarlas en dos variables de tipo 
int. Por ultimo realizar una división con los dos numeros y mostrar el resultado. 
*/
package sistema;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Sebas
 */
public class Sistema {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        DivisionNumero divisor;
        System.out.print("Ingrese un nro: ");
        String nro1 = leer.next();
        System.out.print("Ingrese otro nro: ");
        String nro2 = leer.next();
        try{
            divisor = new DivisionNumero(Integer.parseInt(nro1),Integer.parseInt(nro2));
            System.out.println(divisor.getNro1() + "   " + divisor.getNro2());
            System.out.printf("Division: %.2f\n",divisor.divisionEntreNum());
        } catch (NumberFormatException exception){
            System.out.println("Colocó una letra en vez de un numero");
        }
        
    }
    
}
