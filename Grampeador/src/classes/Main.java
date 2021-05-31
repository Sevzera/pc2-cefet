/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.Scanner;

/**
 *
 * @author sev
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Grampeador gramp1 = new Grampeador();
        int size;
        System.out.println("Quantas folhas serao grampeadas?");
        size = input.nextInt();
        Folha folhas[] = new Folha[size];
        gramp1.grampear(folhas);      
    }
}
