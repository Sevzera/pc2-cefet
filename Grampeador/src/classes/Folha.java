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
public class Folha {
    private String formato;
    private String cor;
    
    public Folha(){
        
    }
    
    public void setFormato(String formato){
        this.formato = formato;
    }
    
    public String getFormato(){
        return this.formato;
    }
    
    public void setCor(String cor){
        this.cor = cor;
    }
    
    public String getCor(){
        return this.cor;
    }
       
}
