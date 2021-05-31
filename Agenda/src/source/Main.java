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
        Scanner input = new Scanner(System.in);
        Agenda agenda = new Agenda();
        String nome;
        int numero;
        String email;
        int op = 1;
        do {
            System.out.println("==================================\n"
                    + "Selecione a opção desejada:\n"
                    + "(1) - Insere novo contato na agenda\n"
                    + "(2) - Exibe o número total de contatos da agenda\n"
                    + "(3) - Exibe um contato (pesquisa pelo nome)\n"
                    + "(4) - Exclui um contato (pesquisa pelo nome)\n"
                    + "(5) - Exibe todos os contatos da agenda\n"
                    + "(0) - Sair\n"
                    + "==================================");
            op = input.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Digite o nome do contato");
                    nome = input.next();
                    System.out.println("Digite o numero do contato");
                    numero = input.nextInt();
                    System.out.println("Digite o email do contato");
                    email = input.next();
                    Contato c = new Contato(nome, numero, email);
                    agenda.addContato(c);
                    break;
                case 2:
                    agenda.exibirTotal();
                    break;
                case 3:
                    System.out.println("Digite o nome do contato");
                    nome = input.next();
                    agenda.exibirCont(nome);
                    break;
                case 4:
                    System.out.println("Digite o nome do contato");
                    nome = input.next();
                    agenda.excluirCont(nome);
                    break;
                case 5:
                    agenda.exibirTodos();
                    break;
            }

        } while (op != 0);
    }
}
