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
public class Enquete {
    private int size;
    private int[] notas = new int[size];
    
    public Enquete(){

    }

    public int[] getNotas() {
        return this.notas;
    }

    public void setNotas(int[] n) {
        this.notas = n;
    }
     
    public void setSize(int s){
        this.size = s;
    }
    
    public int getSize(){
        return this.size;
    }
    
    public float calcMedia(){
        float cont=0;
        float soma = 0;
        for(int i=0; i<notas.length; i++){
            soma = soma + notas[i];
            cont++;
        }
        return soma/cont;
    }
    
    public int freqNota(int num){
        int freq = 0;
        for(int i = 0; i<notas.length; i++){
            if(notas[i] == num){
                freq++;
            }
        }   
        return freq;
    }
    

    
}
