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
public class Jogador {
    private Carta[] mao;

    public Jogador(int size) {
        mao = new Carta[size];
    }
    
    public Carta maiorValor(){
        Carta maior = this.getMao()[0];
        
        for(int i = 0; i<=this.mao.length - 1; i++){
            if(this.getMao()[i].getValor() > maior.getValor()){
                maior = this.getMao()[i];
            }
        }
        
        return maior;
    }
    
    public Carta[] getMao() {
        return mao;
    }

    public void setMao(Carta[] mao) {
        this.mao = mao;
    }
    
    
}
