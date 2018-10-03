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
    private String resSuma;
    private String resResta;
    private String resMult;
    private String resDiv;

    public String getResSuma() {
        return resSuma;
    }

    public String getResResta() {
        return resResta;
    }

    public String getResMult() {
        return resMult;
    }

    public String getResDiv() {
        return resDiv;
    }
    
    public void suma(int operador1, int operador2){
        resSuma = String.valueOf(operador1 + operador2);
    }
    
    public void resta(int operador1, int operador2){
        resResta = String.valueOf(operador1 - operador2);
    }
    
    public void multiplicacion(int operador1, int operador2){
        resMult = String.valueOf(operador1 * operador2);
    }
    
    public void divicion(int operador1, int operador2){
        resDiv = String.valueOf(operador1/operador2);
    }
}
