/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OO.Interfaces.CalcArea;

/**
 *
 * @author felip
 */
public class Quadrado implements AreaCalculavel{

    private double lado;
    
    public Quadrado(double lado){
        this.lado = lado;
    }
    
    @Override
    public double calculaArea() {
        return this.lado * this.lado;
    }
    
}
