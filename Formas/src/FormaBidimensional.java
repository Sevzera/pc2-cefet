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
public abstract class FormaBidimensional extends Forma {

    public FormaBidimensional(double x, double y, double z) {
        super(x, y, z);
    }

    @Override
    public double obterVolume(Forma forma) throws NoVolumeException {
        throw new NoVolumeException();
    }

}
