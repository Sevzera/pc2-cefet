/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package source;

import java.util.Collections;
import java.util.Arrays;

/**
 *
 * @author sev
 */
public class Baralho {

    private Carta[] deck;

    public Baralho() {
        deck = new Carta[52];
        String[] naipes = {"Paus", "Espadas", "Copas", "Ouros"};

        int i;
        for (i = 0; i <= 12; i++) {
            deck[i] = new Carta(naipes[0], i + 1);
        }

        for (i = 13; i <= 25; i++) {
            deck[i] = new Carta(naipes[1], i - 13 + 1);

        }

        for (i = 26; i <= 38; i++) {
            deck[i] = new Carta(naipes[2], i - 26 + 1);

        }

        for (i = 39; i <= 51; i++) {
            deck[i] = new Carta(naipes[3], i - 39 + 1);

        }
    }

    public void embaralhar() {

        Collections.shuffle(Arrays.asList(deck));
        System.out.println("Embaralhado");
        
    }

    public void distribuir(Jogador j1, Jogador j2) {

        Carta[] mao1 = new Carta[j1.getMao().length];
        Carta[] mao2 = new Carta[j2.getMao().length];

        for (int i = 0; i <= j1.getMao().length - 1; i++) {
            mao1[i] = this.getDeck()[51 - i];
        }

        for (int i = 0; i <= j2.getMao().length - 1; i++) {
            mao2[i] = this.getDeck()[(51 - j1.getMao().length) - i];
        }

        j1.setMao(mao1);
        j2.setMao(mao2);

    }

    public Carta[] getDeck() {
        return deck;
    }

    public void setDeck(Carta[] deck) {
        this.deck = deck;
    }

}
