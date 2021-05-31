/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package source;

import java.util.ArrayList;

/**
 *
 * @author sev
 */
public class Agenda {

    private ArrayList<Contato> agenda;

    public Agenda() {
        agenda = new ArrayList<>();
    }

    public void addContato(Contato c) {
        agenda.add(c);
    }

    public void exibirTotal() {
        System.out.println(agenda.size() + " contatos registrados");
    }

    public void exibirCont(String nome) {
        for (Contato c : agenda) {
            if (nome.equals(c.getNome())) {
                System.out.println("Nome: " + c.getNome());
                System.out.println("Numero: " + c.getNumero());
                System.out.println("Email: " + c.getEmail());
            }
        }
    }

    public void excluirCont(String nome) {
        int cont = 0;
        for (Contato c : agenda) {
            if (nome.equals(c.getNome())) {
                break;
            } else {
                cont++;
            }
        }
        agenda.remove(cont);
    }

    public void exibirTodos() {
        for (Contato c : agenda) {
            System.out.println("Nome: " + c.getNome());
            System.out.println("Numero: " + c.getNumero());
            System.out.println("Email: " + c.getEmail());
        }
    }

}
