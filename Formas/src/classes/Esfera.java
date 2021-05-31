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
public class Esfera extends FormaTridimensional {

    public Esfera(double x, double y, double z) {
        super(x, y, z);
        this.descricao = "Esfera";
    }

    @Override
    public double obterArea(Forma forma) {
        double area;
        area = ((this.getX()/2) * (this.getX()/2)) * 4 * Math.PI;
        return area;
    }

    @Override
    public double obterVolume(Forma forma) {
        double volume;
        volume = ((this.getX()/2) * (this.getX()/2) * (this.getX()/2)) * (4/3) * Math.PI;
        return volume;
    }

}
