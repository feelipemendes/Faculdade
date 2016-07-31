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
public class Retangulo implements AreaCalculavel{

    private double largura;
    private double altura;
    
    public Retangulo(double largura, double altura){
        this.largura = largura;
        this.altura = altura;
    }
    
    @Override
    public double calculaArea() {
      return this.largura * this.altura;
    }
    
}
