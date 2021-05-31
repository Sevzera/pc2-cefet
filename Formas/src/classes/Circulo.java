/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author sev
 */
public class Circulo extends FormaBidimensional {

    public Circulo(double x, double y) {
        super(x, y, 0);
        this.descricao = "Circulo";
    }
    
    @Override
    public double obterArea(Forma forma) {
        double area;
        area = (this.getX() * this.getX()) * Math.PI;
        return area;
    }

}
