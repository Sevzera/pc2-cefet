/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package source;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 *
 * @author sev
 */
public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        SecureRandom gen = new SecureRandom();
        Enquete enq1 = new Enquete();

        int size;
        System.out.println("Digite a quantidade de alunos entrevistados");
        size = input.nextInt();
        enq1.setSize(size);
        
        int n[] = new int[size];
        for(int i=0; i<size; i++){
            n[i] = gen.nextInt(11);
        }
        enq1.setNotas(n);
        
        int num;
        System.out.println("Qual nota deve ter sua frequencia mostrada?");
        num = input.nextInt();
        
        System.out.println("Frequencia da nota " + num + ": " + enq1.freqNota(num));
        System.out.println("Nota Media: " + enq1.calcMedia());
        System.out.println("Alunos entrevistados: " + enq1.getSize()); 
        
        /*System.out.println("Vetor de notas: ");
        n = enq1.getNotas();
        for(int i=0; i<size; i++){
            System.out.printf("%d ", n[i]);
        }
        System.out.println("");*/
        
    }
}


    
