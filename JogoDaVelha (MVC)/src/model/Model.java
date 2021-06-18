/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import view.Frame;

/**
 *
 * @author sev-desktop
 */
public class Model {

    public boolean checkIfWon(Frame f) {
        if (    
                   (f.getTxt1().getText().equals(f.getTxt2().getText())) && (f.getTxt1().getText().equals(f.getTxt3().getText())) && !(f.getTxt1().getText().isEmpty())
                || (f.getTxt4().getText().equals(f.getTxt5().getText())) && (f.getTxt4().getText().equals(f.getTxt6().getText())) && !(f.getTxt4().getText().isEmpty())
                || (f.getTxt7().getText().equals(f.getTxt8().getText())) && (f.getTxt7().getText().equals(f.getTxt9().getText())) && !(f.getTxt7().getText().isEmpty())
                || (f.getTxt1().getText().equals(f.getTxt4().getText())) && (f.getTxt1().getText().equals(f.getTxt7().getText())) && !(f.getTxt1().getText().isEmpty())
                || (f.getTxt2().getText().equals(f.getTxt5().getText())) && (f.getTxt2().getText().equals(f.getTxt8().getText())) && !(f.getTxt2().getText().isEmpty())
                || (f.getTxt3().getText().equals(f.getTxt6().getText())) && (f.getTxt3().getText().equals(f.getTxt9().getText())) && !(f.getTxt3().getText().isEmpty())
                || (f.getTxt1().getText().equals(f.getTxt5().getText())) && (f.getTxt1().getText().equals(f.getTxt9().getText())) && !(f.getTxt1().getText().isEmpty())
                || (f.getTxt3().getText().equals(f.getTxt5().getText())) && (f.getTxt3().getText().equals(f.getTxt7().getText())) && !(f.getTxt3().getText().isEmpty())) {
            return true;
        }
        return false;
    }

    public boolean checkIfFull(Frame f) {
        if (
                   !(f.getTxt1().getText().isEmpty())
                && !(f.getTxt2().getText().isEmpty())
                && !(f.getTxt3().getText().isEmpty())
                && !(f.getTxt4().getText().isEmpty())
                && !(f.getTxt5().getText().isEmpty())
                && !(f.getTxt6().getText().isEmpty())
                && !(f.getTxt7().getText().isEmpty())
                && !(f.getTxt8().getText().isEmpty())
                && !(f.getTxt9().getText().isEmpty())) {
            return true;
        } else 
            return false;
    }
}
