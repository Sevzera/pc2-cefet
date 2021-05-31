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
public abstract class Forma {

    protected String descricao;
    protected double x;
    protected double y;
    protected double z;

    public Forma(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public abstract double obterArea(Forma forma);

    public abstract double obterVolume(Forma forma) throws NoVolumeException;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

}
