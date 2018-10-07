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
public class Divicion extends Operacion{
    double div;
    
    public Divicion(double p_n1, double p_n2){
        super(p_n1, p_n2,'/');
        if(p_n2 == 0){
            System.out.println("Error en divición");
        }else{
            this.div = p_n2/p_n2;
            this.setResult(this.div);
        } 
         
    }
    
}
