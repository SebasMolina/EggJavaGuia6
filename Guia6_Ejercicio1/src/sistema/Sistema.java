/*
Inicializar un objeto de la clase Persona ejercicio 7 de la guía POO, a null y tratar de 
invocar el método esMayorDeEdad() a través de ese objeto. Luego, englobe el código 
con una cláusula try-catch para probar la nueva excepción que debe ser controlada.
*/
package sistema;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Sebas
 */
public class Sistema {

/*
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad
en distintas variables, para después en el main, calcular un porcentaje de esas 4
personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por
encima, y también calcularemos un porcentaje de cuantos son mayores de edad y
cuantos menores.
*/
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        Persona[] listaPersona;
        System.out.print("Cuantas personas son? ");
        int cantidadPersonas  = leer.nextInt();
        listaPersona = new Persona[cantidadPersonas];
        int peso;
        boolean edad;
        double porcentajeIdealPeso=0, porcentajeDebajoPeso=0, porcentajeEncimaPeso=0;
        double porcentajeMayorEdad=0, porcentajeMenorEdad=0;
        
        for (int i=0; i<cantidadPersonas; i++){
            listaPersona[i] = new Persona();
            listaPersona[i].crearPersona();
            peso = listaPersona[i].calcularIMC();
            System.out.println(peso);
            switch (peso){
                case 1:
                    porcentajeEncimaPeso++;
                    System.out.println(listaPersona[i].getNombres()+" tiene sobrepeso");
                    break;
                case -1:
                    porcentajeDebajoPeso++;
                    System.out.println(listaPersona[i].getNombres()+" está por debajo del peso ideal");
                    break;
                case 0:
                    porcentajeIdealPeso++;
                    System.out.println(listaPersona[i].getNombres()+" tiene peso ideal");
                    break;
                default:
                    System.out.println("Error en la ecuacion");     
            }
            edad = listaPersona[i].esMayorDeEdad();
            if (edad) {
                porcentajeMayorEdad++;
                System.out.println(listaPersona[i].getNombres()+" Es Mayor de edad");
            } else {
                porcentajeMenorEdad++;
                System.out.println(listaPersona[i].getNombres()+" Es Menor de edad");
            }
        }
        System.out.println("Porcentajes: ");
        System.out.printf("Personas con sobrepeso: %.2f %%\n",porcentajeEncimaPeso*100/cantidadPersonas);
        System.out.printf("Personas con peso ideal: %.2f %%\n",porcentajeIdealPeso*100/cantidadPersonas);
        System.out.printf("Personas con peso por debajo del ideal: %.2f %%\n",porcentajeDebajoPeso*100/cantidadPersonas);
        System.out.printf("Personas Mayores: %.2f %%\n",porcentajeMayorEdad*100/cantidadPersonas);
        System.out.printf("Personas Menores: %.2f %%\n",porcentajeMenorEdad*100/cantidadPersonas);
    }
        
        
        
    
    
}
