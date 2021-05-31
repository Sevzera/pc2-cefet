/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package source;

/**
 *
 * @author sev
 */
public class Tetraedro extends FormaTridimensional {

    public Tetraedro(double x, double y, double z) {
        super(x, y, z);
        this.descricao = "Tetraedro";
    }

    @Override
    public double obterArea(Forma forma) {
        double area;
        area = ((Math.sqrt(((this.getX() * this.getX()) + (this.getY() * this.getY()))) + this.getX())/2) * 6;
        return area;
    }

    @Override
    public double obterVolume(Forma forma) {
        double volume;
        volume = ((Math.sqrt(((this.getX() * this.getX()) + (this.getY() * this.getY()))) + this.getX())/2) * this.getY() * 1/3;
        return volume;
    }

}
