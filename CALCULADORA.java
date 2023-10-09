/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author AlumnoT
 */
public class CALCULADORA {

    /**
     * @param args the command line arguments
     */
    public static void mensaje() {
        System.out.println("ESCOJA OPERACION 1(suma), 2(resta),3(multiplicacion),4(division)");
    }

    public static double elnumero1() {
        Scanner leer = new Scanner(System.in);
        //LLamamos a la extensión que nos permita leer el dato introducido

        System.out.println("introduce el primer valor");// aquí leería lo que escriba el usuario
        double numero1 = leer.nextDouble(); //establece el nº1
        return numero1;
    }

    public static double elnumero2() {
        System.out.println("introduce el segundo valor");// aquí leería lo que escriba el usuario
        Scanner leer2 = new Scanner(System.in);
        double numero2 = leer2.nextDouble(); // establece el nº2
        // continuamos estableciendo las operaciones que va a realizar la calculadora
        return numero2;
    }
        public static double resultadosumar(double numero1, double numero2) {
        double resultado; 
        resultado =  numero1 +  numero2;
        return resultado;
        }

    public static void main(String[] args) {
        System.out.println("Hola, te damos la bienvenida a tu calculadora mejorada");

        double numero1;
        double numero2;
        double suma;
        double resta;
        double multiplicacion;  //DEFINIMOS PARAMETROS- se puede poner en una linea como: double numero1,numero2,suma,resta,multiplicacion,division,resto
        double division;
        double resto;
        int operacion;

        numero1 = elnumero1();
        numero2 = elnumero2();

        suma = resultadosumar(numero1, numero2);
        resta = numero1 - numero2;
        multiplicacion = numero1 * numero2;
        division = numero1 / numero2;
        resto = numero1 % numero2;

        mensaje();
        Scanner leer3 = new Scanner(System.in);
        operacion = leer3.nextInt();     //establece que operacion

        switch (operacion) {
            case 1:
                System.out.println("El resultado de la suma es " + suma);
                break;

            case 2:
                System.out.println("El resultado de la resta es " + resta);
                break;

            case 3:
                System.out.println("El resultado de la multiplicacion es " + multiplicacion);
                break;

            case 4:
                System.out.println("El resultado de la division es " + division + "y el resto es " + resto);
                break;

            default:
                System.out.println("ERROR ");
                
        }

    }

}
