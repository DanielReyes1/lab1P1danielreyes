package lab1_danielreyes;

import java.util.Scanner;

public class Lab1_danielreyes {

   public static void main(String [] args) {
       Scanner entrada = new Scanner ( System.in);
       
       System.out.println("-- Bienvenido al sistema de calculo promedio--");
       System.out.print("Ingrese su nombre: "); //Se ingresa el nombre del usuario
       
       String nombre = entrada.nextLine();
       
       //Se ingresan las notas de las cuatro clases
       System.out.println ("Ingrese la nota final de la primera clase:  ");
       double primeraClase = entrada.nextDouble();
       
       System.out.println ("Ingrese la nota final de la segunda clase:  ");
       double segundaClase = entrada.nextDouble();
       
       System.out.println ("Ingrese la nota final de la tercera clase:  ");
       double terceraClase = entrada.nextDouble();
       
       System.out.println ("Ingrese la nota final de la cuarta clase:  ");
       double cuartaClase = entrada.nextDouble();
       
       //Se calculo del promedio
       double sumaClase = primeraClase + segundaClase + terceraClase + cuartaClase;
       double promedio = sumaClase / 4;
       
       //Se imprime el calculo del promedio
       System.out.println("---" + nombre + " el promedio de las cuatro clases es: " + promedio);
       
    }
    
}
