/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author i5
 */
public class Suma extends Operacion {
    double suma;
    
    public Suma(double p_n1, double p_n2){
        super(p_n1, p_n2, '+');
        this.suma = p_n1 + p_n2;
        this.setResult(this.suma);
    }
    
}
