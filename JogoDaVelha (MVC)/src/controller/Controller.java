/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JTextField;
import model.Model;
import view.Frame;

/**
 *
 * @author sev-desktop
 */
public class Controller implements ActionListener, MouseListener {

    private Model m;
    private Frame f;

    public Controller() {
        m = new Model();
        f = new Frame(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(f.getBtn1())) {
            f.getTxt1().setText(null);
            f.getTxt2().setText(null);
            f.getTxt3().setText(null);
            f.getTxt4().setText(null);
            f.getTxt5().setText(null);
            f.getTxt6().setText(null);
            f.getTxt7().setText(null);
            f.getTxt8().setText(null);
            f.getTxt9().setText(null);
            f.getLbl1().setText("Escolha sua peca e clique na posicao desejada");
        }
        if (ae.getSource().equals(f.getBtn2())) {
            System.exit(0);
        }
        if (ae.getSource().equals(f.getTglO())) {
            f.getTglX().setSelected(false);
        }
        if (ae.getSource().equals(f.getTglX())) {
            f.getTglO().setSelected(false);
        }

    }

    @Override
    public void mouseClicked(MouseEvent me) {
    }

    @Override
    public void mousePressed(MouseEvent me) {
        if (me.getSource() instanceof JTextField) {
            if (f.getTglO().isSelected()) {
                if (me.getSource().equals(f.getTxt1())) {
                    f.getTxt1().setText("O");
                }
                if (me.getSource().equals(f.getTxt2())) {
                    f.getTxt2().setText("O");
                }
                if (me.getSource().equals(f.getTxt3())) {
                    f.getTxt3().setText("O");
                }
                if (me.getSource().equals(f.getTxt4())) {
                    f.getTxt4().setText("O");
                }
                if (me.getSource().equals(f.getTxt5())) {
                    f.getTxt5().setText("O");
                }
                if (me.getSource().equals(f.getTxt6())) {
                    f.getTxt6().setText("O");
                }
                if (me.getSource().equals(f.getTxt7())) {
                    f.getTxt7().setText("O");
                }
                if (me.getSource().equals(f.getTxt8())) {
                    f.getTxt8().setText("O");
                }
                if (me.getSource().equals(f.getTxt9())) {
                    f.getTxt9().setText("O");
                }
                if (m.checkIfWon(f) == true) {
                    f.getLbl1().setText("Vitoria do jogador O");
                    f.getTxt1().setText(null);
                    f.getTxt2().setText(null);
                    f.getTxt3().setText(null);
                    f.getTxt4().setText(null);
                    f.getTxt5().setText(null);
                    f.getTxt6().setText(null);
                    f.getTxt7().setText(null);
                    f.getTxt8().setText(null);
                    f.getTxt9().setText(null);
                }
                if (m.checkIfFull(f)) {
                    f.getLbl1().setText("Jogo empatado");
                    f.getTxt1().setText(null);
                    f.getTxt2().setText(null);
                    f.getTxt3().setText(null);
                    f.getTxt4().setText(null);
                    f.getTxt5().setText(null);
                    f.getTxt6().setText(null);
                    f.getTxt7().setText(null);
                    f.getTxt8().setText(null);
                    f.getTxt9().setText(null);
                }

            } else if (f.getTglX().isSelected()) {
                if (me.getSource().equals(f.getTxt1())) {
                    f.getTxt1().setText("X");
                }
                if (me.getSource().equals(f.getTxt2())) {
                    f.getTxt2().setText("X");
                }
                if (me.getSource().equals(f.getTxt3())) {
                    f.getTxt3().setText("X");
                }
                if (me.getSource().equals(f.getTxt4())) {
                    f.getTxt4().setText("X");
                }
                if (me.getSource().equals(f.getTxt5())) {
                    f.getTxt5().setText("X");
                }
                if (me.getSource().equals(f.getTxt6())) {
                    f.getTxt6().setText("X");
                }
                if (me.getSource().equals(f.getTxt7())) {
                    f.getTxt7().setText("X");
                }
                if (me.getSource().equals(f.getTxt8())) {
                    f.getTxt8().setText("X");
                }
                if (me.getSource().equals(f.getTxt9())) {
                    f.getTxt9().setText("X");
                }
                if (m.checkIfWon(f) == true) {
                    f.getLbl1().setText("Vitoria do jogador X");
                    f.getTxt1().setText(null);
                    f.getTxt2().setText(null);
                    f.getTxt3().setText(null);
                    f.getTxt4().setText(null);
                    f.getTxt5().setText(null);
                    f.getTxt6().setText(null);
                    f.getTxt7().setText(null);
                    f.getTxt8().setText(null);
                    f.getTxt9().setText(null);
                }
                if (m.checkIfFull(f)) {
                    f.getLbl1().setText("Jogo empatado");
                    f.getTxt1().setText(null);
                    f.getTxt2().setText(null);
                    f.getTxt3().setText(null);
                    f.getTxt4().setText(null);
                    f.getTxt5().setText(null);
                    f.getTxt6().setText(null);
                    f.getTxt7().setText(null);
                    f.getTxt8().setText(null);
                    f.getTxt9().setText(null);
                }
            }
        }
    }

    @Override
    public void mouseReleased(MouseEvent me) {
    }

    @Override
    public void mouseEntered(MouseEvent me) {
    }

    @Override
    public void mouseExited(MouseEvent me) {
    }
}
