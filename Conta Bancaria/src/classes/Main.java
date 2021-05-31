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
        Conta c1 = new Conta();
        Conta c2 = new Conta();

        System.out.println("Sistema iniciado");
        
        char yorn = 'y';
        int opc;

        do {
            System.out.println("O que deseja fazer?");
            System.out.println("1 - Abrir conta");
            System.out.println("2 - Fechar conta");
            System.out.println("3 - Depositar valor");
            System.out.println("4 - Sacar valor");
            System.out.println("5 - Pagar mensalidade");
            System.out.println("6 - Exibir informacoes da conta");
            opc = input.nextInt();
            switch (opc) {
                case 1:
                    c1.abrirConta();
                    break;
                case 2:
                    c1.fecharConta();
                    break;
                case 3:
                    c1.depositar();
                    break;
                case 4:
                    c1.sacar();
                    break;
                case 5:
                    c1.pagarMensal();
                    break;
                case 6:
                    c1.showInfo();
                    break;
                default:
                    System.out.println("Opcao invalida");
                    break;

            }
            System.out.println("Deseja continuar? (y|n)");
            yorn = input.next().charAt(0);
        } while (yorn == 'y' && yorn != 'n');
        System.out.println("Sistema Encerrado");
    }
}
