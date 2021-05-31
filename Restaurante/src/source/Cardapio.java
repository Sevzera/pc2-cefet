/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package source;

import java.util.Scanner;

/**
 *
 * @author sev
 */
public class Cardapio {

    private String[] horarios = {"CDM", "LDM", "ALM", "LDT", "JAN", "CEIA"};
    private String[] dias = {"Domingo", "Segunda", "Terca", "Quarta", "Quinta", "Sexta", "Sabado"};
    private Refeicao[][] cardapio = new Refeicao[horarios.length][dias.length];
    Scanner input = new Scanner(System.in);

    public Cardapio() {
        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < horarios.length; j++) {
                cardapio[j][i] = new Refeicao();
                cardapio[j][i].setCaloria(0);
                cardapio[j][i].setDescricao(null);
            }
        }
    }

    public void addRefeicao(int dia, int horario) {
        System.out.println("Escreva o nome da refeicao: ");
        cardapio[horario - 1][dia - 1].setDescricao(input.next());
        System.out.println("Escreva quantas calorias tem a refeicao: ");
        cardapio[horario - 1][dia - 1].setCaloria(input.nextDouble());
    }

    public void remRefeicao(int dia, int horario) {
        System.out.printf("Voce removeu %s\n", cardapio[horario][dia].getDescricao());
        cardapio[horario - 1][dia - 1].setCaloria(0);
        cardapio[horario - 1][dia - 1].setDescricao(null);

    }

    public void showRefeicao(int dia) {
        System.out.printf("Refeicoes de ");
        switch (dia) {
            case 1:
                System.out.printf("Domingo\n");
                for (int i = 0; i < horarios.length; i++) {
                    System.out.printf("%s\n", cardapio[i][dia - 1].getDescricao());
                    System.out.printf("Calorias: %f\n", cardapio[i][dia - 1].getCaloria());
                    System.out.println("");

                }
                break;
            case 2:
                System.out.printf("Segunda\n");
                for (int i = 0; i < horarios.length; i++) {
                    System.out.printf("%s\n", cardapio[i][dia - 1].getDescricao());
                    System.out.printf("Calorias: %f\n", cardapio[i][dia - 1].getCaloria());
                    System.out.println("");

                }
                break;

            case 3:
                System.out.printf("Terca\n");
                for (int i = 0; i < horarios.length; i++) {
                    System.out.printf("%s\n", cardapio[i][dia - 1].getDescricao());
                    System.out.printf("Calorias: %f\n", cardapio[i][dia - 1].getCaloria());
                    System.out.println("");

                }
                break;

            case 4:
                System.out.printf("Quarta\n");
                for (int i = 0; i < horarios.length; i++) {
                    System.out.printf("%s\n", cardapio[i][dia - 1].getDescricao());
                    System.out.printf("Calorias: %f\n", cardapio[i][dia - 1].getCaloria());
                    System.out.println("");

                }
                break;

            case 5:
                System.out.printf("Quinta\n");
                for (int i = 0; i < horarios.length; i++) {
                    System.out.printf("%s\n", cardapio[i][dia - 1].getDescricao());
                    System.out.printf("Calorias: %f\n", cardapio[i][dia - 1].getCaloria());
                    System.out.println("");

                }
                break;

            case 6:
                System.out.printf("Sexta\n");
                for (int i = 0; i < horarios.length; i++) {
                    System.out.printf("%s\n", cardapio[i][dia - 1].getDescricao());
                    System.out.printf("Calorias: %f\n", cardapio[i][dia - 1].getCaloria());
                    System.out.println("");

                }
                break;

            case 7:
                System.out.printf("Sabado\n");
                for (int i = 0; i < horarios.length; i++) {
                    System.out.printf("%s\n", cardapio[i][dia - 1].getDescricao());
                    System.out.printf("Calorias: %f\n", cardapio[i][dia - 1].getCaloria());
                    System.out.println("");

                }
                break;
        }
    }

    public void showCardapio() {
        for (int i = 0; i < dias.length; i++) {
            System.out.printf("%s\n", dias[i]);
            for (int j = 0; j < horarios.length; j++) {
                System.out.printf("%s: %s\n", horarios[j], cardapio[j][i].getDescricao());
            }
            System.out.println("");
        }
    }

    public void calcTotalCalorias() {
        double total = 0;
        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < horarios.length; j++) {
                total = total + cardapio[j][i].getCaloria();
            }
        }
        System.out.println("");
        System.out.println("Total de calorias: " + total);
        System.out.println("");
    }
}
