/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author sev
 */
public class Model {
    private ArrayList<Paciente> pacientes;
    private Comparator c;
    
    public Model(){
        pacientes = new ArrayList<>();
    }

    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }
    
    public int qtdPacientes(){
        return this.pacientes.size();
    }
    
    public double mediaIdadeHomens(){
        double soma = 0;
        int cont = 0;
        for(int i = 0; i <= pacientes.size() - 1; i++){
            if(pacientes.get(i).getSexo().equals("M")){
            soma = soma + pacientes.get(i).getIdade();
            cont++;
            }
        }
        double media;
        media = soma/cont;
        if(media > 0){
        return media;
        } else {
            return 0;
        }
    }
    
    public int mulheresSobrepeso(){
        int cont = 0;
        for(int i = 0; i <= pacientes.size() - 1; i++){
            if(pacientes.get(i).getSexo().equals("F")){
                if(pacientes.get(i).getAltura() > 1.6 && pacientes.get(i).getAltura() < 1.7 && pacientes.get(i).getPeso() > 70){
                    cont++;
                }
            }
        }
        return cont;
    }
    
    public String nomeMaisVelho(){
        String nome = null;
        int idade = 0;
        for(int i = 0; i <= pacientes.size() - 1; i++){
            if(pacientes.get(i).getIdade() > idade){
                idade = pacientes.get(i).getIdade();
                nome = pacientes.get(i).getNome();
            }
        }
        return nome;
    }
    
    public String mulherMaisBaixa(){
        String nome = null;
        double altura = 500;
        for(int i = 0; i <= pacientes.size() - 1; i++){
            if(pacientes.get(i).getAltura() < altura){
                altura = pacientes.get(i).getAltura();
                nome = pacientes.get(i).getNome();
            }
        }
        return nome;
    }
    
    public int qtdJovens(){
        int cont = 0;
        for(int i = 0; i <= pacientes.size() - 1; i ++){
            if(pacientes.get(i).getIdade() > 18 && pacientes.get(i).getIdade() < 25){
                cont++;
            }
        }
        return cont;
    }
    
}
