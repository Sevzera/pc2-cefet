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
public class Grampeador {
    private String tipoGrampo;
    
    public Grampeador(){
        
    }
    
    public void setTipoGrampo(String tipoGrampo){
        this.tipoGrampo = tipoGrampo;
    }
    
    public String getTipoGrampo(){
        return this.tipoGrampo;
    }
    
    public void grampear(Folha folhas[]){
        System.out.println("Foram grampeadas " + folhas.length + " folhas");  
    }
}
