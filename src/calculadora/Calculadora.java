/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author i5
 * help
 * https://devcode.la/tutoriales/calculadora-en-java/
 * https://jonathanmelgoza.com/blog/como-hacer-una-calculadora-en-java/
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double n1=20,n2=0;
        Suma suma = new Suma(n1, n2);
        suma.mostrarResultador();
        Divicion div = new Divicion(n1, n2);
        div.mostrarResultador();
        Resta resta = new Resta(n1, n2);
        resta.mostrarResultador();
        Multiplicacion mult = new Multiplicacion(n1, n2);
        mult.mostrarResultador();
    }
}
