/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.ArrayList;

/**
 *
 * @author sev
 */
public class TrataForma {

    private ArrayList<Forma> formas;

    public TrataForma() {
        formas = new ArrayList<>();
    }

    public ArrayList<Forma> getFormas() {
        return formas;
    }

    public void imprimirForma(Forma forma) {
        System.out.println("###" + forma.descricao + "###");
        System.out.println("Dimensao X: " + forma.getX());
        System.out.println("Dimensao Y: " + forma.getY());
        System.out.println("Dimensao Z: " + forma.getZ());
        System.out.println("Area: " + forma.obterArea(forma));
        try{
            System.out.println("Volume: " + forma.obterVolume(forma));
        } catch (NoVolumeException e) {
            System.out.println("Volume: " + e.getMessage());
        }
    }
}
