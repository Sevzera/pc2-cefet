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
        Baralho b = new Baralho();
        System.out.println("Mesa embaralhando...");
        b.embaralhar();
        System.out.println("Informe o número de cartas a distribuir para os jogadores:");
        int size = input.nextInt();
        Jogador j1 = new Jogador(size);
        Jogador j2 = new Jogador(size);
        System.out.println("Mesa distribui as " + size + " cartas para o jogador A e para o jogador B");
        b.distribuir(j1, j2);
        Carta maior1 = j1.maiorValor();
        Carta maior2 = j2.maiorValor();
        System.out.println("O jogador A joga a carta " + maior1.getNaipe() + " de valor " + maior1.getValor());
        System.out.println("O jogador B joga a carta " + maior2.getNaipe() + " de valor " + maior2.getValor());

        if (maior1.getValor() > maior2.getValor()) {
            System.out.println("Jogador A venceu o jogo");

        } else if (maior2.getValor() > maior1.getValor()) {
            System.out.println("Jogador B venceu o jogo");

        } else if (maior1.getValor() == maior2.getValor()) {
            int peso1 = 0;
            int peso2 = 0;

            String naipe1 = maior1.getNaipe();
            switch (naipe1) {
                case "Ouros":
                    peso1 = 3;
                    break;
                case "Copas":
                    peso1 = 2;
                    break;
                case "Espadas":
                    peso1 = 1;
                    break;
                case "Paus":
                    peso1 = 0;
                    break;
            }

            String naipe2 = maior2.getNaipe();
            switch (naipe2) {
                case "Ouros":
                    peso2 = 3;
                    break;
                case "Copas":
                    peso2 = 2;
                    break;
                case "Espadas":
                    peso2 = 1;
                    break;
                case "Paus":
                    peso2 = 0;
                    break;
            }
            if (peso1 > peso2) {
                System.out.println("Cartas iguais, jogador 1 venceu pelo naipe " + maior1.getNaipe());
            } else if (peso2 > peso1) {
                System.out.println("Cartas iguais, jogador 2 venceu pelo naipe " + maior2.getNaipe());
            } else {
                System.out.println("Cartas iguais, empate");
            }
        }

    }
}
