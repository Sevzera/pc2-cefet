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
public class Main {

    public static void main(String[] args) {
        char op = 'y';
        int n, dia, horario;
        Scanner input = new Scanner(System.in);
        Cardapio c;
        c = new Cardapio();

        do {
            System.out.println("O que deseja fazer?");
            System.out.println("1 - Adicionar refeicao");
            System.out.println("2 - Remover refeicao");
            System.out.println("3 - Calcular calorias totais");
            System.out.println("4 - Mostrar refeicoes de um dia");
            System.out.println("5 - Mostrar cardapio");
            n = input.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Digite o dia da semana (De 1 a 7)");
                    dia = input.nextInt();
                    System.out.println("Digite o horario (De 1 a 6)");
                    horario = input.nextInt();
                    c.addRefeicao(dia, horario);
                    break;
                case 2:
                    System.out.println("Digite o dia da semana (De 1 a 7)");
                    dia = input.nextInt();
                    System.out.println("Digite o horario (De 1 a 6)");
                    horario = input.nextInt();
                    c.remRefeicao(dia, horario);
                    break;
                case 3:
                    c.calcTotalCalorias();
                    break;
                case 4:
                    System.out.println("Digite o dia que tera suas refeicoes exibidas (De 1 a 7)");
                    dia = input.nextInt();
                    c.showRefeicao(dia);
                    break;
                case 5:
                    c.showCardapio();
                    break;
                default:
                    System.out.println("Opcao invalida");
                    break;
            }
        } while (op == 'y');
    }
}
