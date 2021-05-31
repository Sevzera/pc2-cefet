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
public class Quadrado extends FormaBidimensional {

    public Quadrado(double x, double y) {
        super(x, y, 0);
        this.descricao = "Quadrado";
    }

    @Override
    public double obterArea(Forma forma) {
        double area;
        area = this.getX() * this.getY();
        return area;
    }

}
