/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.EventListener;
import javax.swing.*;

/**
 *
 * @author sev-desktop
 */
public class Frame extends JFrame {

    private EventListener handler;
    private JLabel lbl1;
    private JPanel pnl1;
    private JPanel pnl2;
    private JPanel pnl3;
    private JPanel pnl4;
    private JTextField txt1;
    private JTextField txt2;
    private JTextField txt3;
    private JTextField txt4;
    private JTextField txt5;
    private JTextField txt6;
    private JTextField txt7;
    private JTextField txt8;
    private JTextField txt9;
    private JToggleButton tglX;
    private JToggleButton tglO;
    private JButton btn1;
    private JButton btn2;

    public Frame(EventListener h) {
        super("Jogo da Velha");
        this.handler = h;

        lbl1 = new JLabel("Escolha sua peca e clique na posicao desejada");
        lbl1.setHorizontalAlignment(SwingConstants.CENTER);
        add(lbl1, BorderLayout.NORTH);

        pnl1 = new JPanel();
        pnl1.setLayout(new GridLayout(3, 1));

        pnl2 = new JPanel();
        tglX = new JToggleButton("X");
        tglO = new JToggleButton("O");

        pnl2.setLayout(new FlowLayout());
        pnl2.add(tglX);
        tglX.addActionListener(((ActionListener) handler));
        pnl2.add(tglO);
        tglO.addActionListener(((ActionListener) handler));

        pnl3 = new JPanel();
        txt1 = new JTextField(null);
        txt2 = new JTextField(null);
        txt3 = new JTextField(null);
        txt4 = new JTextField(null);
        txt5 = new JTextField(null);
        txt6 = new JTextField(null);
        txt7 = new JTextField(null);
        txt8 = new JTextField(null);
        txt9 = new JTextField(null);

        pnl3.setLayout(new GridLayout(3, 3));
        pnl3.add(txt1);
        txt1.addMouseListener(((MouseListener) handler));
        pnl3.add(txt2);
        txt2.addMouseListener(((MouseListener) handler));
        pnl3.add(txt3);
        txt3.addMouseListener(((MouseListener) handler));
        pnl3.add(txt4);
        txt4.addMouseListener(((MouseListener) handler));
        pnl3.add(txt5);
        txt5.addMouseListener(((MouseListener) handler));
        pnl3.add(txt6);
        txt6.addMouseListener(((MouseListener) handler));
        pnl3.add(txt7);
        txt7.addMouseListener(((MouseListener) handler));
        pnl3.add(txt8);
        txt8.addMouseListener(((MouseListener) handler));
        pnl3.add(txt9);
        txt9.addMouseListener(((MouseListener) handler));
        pnl3.setVisible(true);

        pnl4 = new JPanel();
        btn1 = new JButton("Clear");
        btn1.addActionListener(((ActionListener) handler));
        btn2 = new JButton("Close");
        btn2.addActionListener(((ActionListener) handler));

        pnl4.setLayout(new FlowLayout());
        pnl4.add(btn1);
        pnl4.add(btn2);

        pnl1.add(pnl2);
        pnl1.add(pnl3);
        pnl1.add(pnl4);

        add(pnl1, BorderLayout.CENTER);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 300);
        setVisible(true);

    }

    public JTextField getTxt1() {
        return txt1;
    }

    public JTextField getTxt2() {
        return txt2;
    }

    public JTextField getTxt3() {
        return txt3;
    }

    public JTextField getTxt4() {
        return txt4;
    }

    public JTextField getTxt5() {
        return txt5;
    }

    public JTextField getTxt6() {
        return txt6;
    }

    public JTextField getTxt7() {
        return txt7;
    }

    public JTextField getTxt8() {
        return txt8;
    }

    public JTextField getTxt9() {
        return txt9;
    }

    public JToggleButton getTglX() {
        return tglX;
    }

    public JToggleButton getTglO() {
        return tglO;
    }

    public JButton getBtn1() {
        return btn1;
    }

    public JButton getBtn2() {
        return btn2;
    }

    public JLabel getLbl1() {
        return lbl1;
    }

    
}
