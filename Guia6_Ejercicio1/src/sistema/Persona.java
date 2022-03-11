/*
Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún
otro atributo, puede hacerlo. Los métodos que se implementarán son:
*/
package sistema;

import java.util.Locale;
import java.util.Scanner;

public class Persona {
    private String nombres;
    private int edad;
    private char sexo;
    private double peso;
    private double altura;
//Un constructor por defecto.
    public Persona() {
    }
//Un constructor con todos los atributos como parámetro.
    public Persona(String nombres, int edad, char sexo, double peso, double altura) {
        this.nombres = nombres;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
//Métodos getters y setters de cada atributo.
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
/*
Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje    
*/    
    public void crearPersona(){
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.print("Ingrese el nombre: ");
        nombres = leer.next();
        System.out.print("Ingrese la edad: ");
        edad = leer.nextInt();
        do{
            System.out.print("Ingrese el sexo: ");
            sexo = leer.next().toUpperCase().charAt(0);
        } while (sexo != 'H' && sexo != 'M' && sexo!='O');
        System.out.print("Ingrese la altura (mts): ");
        altura = leer.nextDouble();
        System.out.print("Ingrese el peso (kg): ");
        peso = leer.nextDouble();
        
    }
/*
Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.    
*/
    public int calcularIMC(){
        double imc = peso/Math.pow(altura, 2);
        if (imc<20){
            return -1; //por debajo
        } else if (imc>25){
            return 1; //por encima
        } else {
            return 0; //ideal
        }
    }
//Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
    public boolean esMayorDeEdad(){
        boolean mayor = false;
        if (edad>=18) {
            mayor= true;
        }
        return mayor;
    }
}
