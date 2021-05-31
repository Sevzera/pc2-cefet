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
public class Triangulo extends FormaBidimensional {

    public Triangulo(double x, double y) {
        super(x, y, 0);
        this.descricao = "Triangulo";
    }

    @Override
    public double obterArea(Forma forma) {
        double area;
        area = (this.getX() * this.getY()) / 2;
        return area;
    }

}
