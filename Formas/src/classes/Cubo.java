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
public class Cubo extends FormaTridimensional {

    public Cubo(double x, double y, double z) {
        super(x, y, z);
        this.descricao = "Cubo";
    }

    @Override
    public double obterArea(Forma forma) {
        double area;
        area = (this.getX() * this.getY()) * 6;
        return area;
    }

    @Override
    public double obterVolume(Forma forma) {
        double volume;
        volume = this.getX() * this.getY() * this.getY();
        return volume;
    }

}
