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
public class Operacion {
    private double n1;
    private double n2;
    private double result;

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
    private char operador;

    public Operacion(Double p_n1, Double p_n2, char p_operador){
        this.n1 = p_n1;
        this.n2 = p_n2;
        this.operador = p_operador;
    }
    
    public void mostrarResultador(){
        System.out.println(this.n1+" "+this.operador+" "+this.n2+" = "+this.result);
    }
}
