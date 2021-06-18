/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package source;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author sev
 */
public class Conta {

    private int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    Scanner input = new Scanner(System.in);
    Random gen = new Random();

    public void Conta() {
        this.setTipo("placeholder");
        this.setStatus(false);
        this.setSaldo(0);
    }

    public void abrirConta() {
        if (this.status == true) {
            System.out.println("Esta conta ja esta aberta");
        } else if (this.status == false) {
            System.out.println("Qual sera o tipo da conta? (Digite CC para Conta Corrente ou CP para Conta Poupanca)");
            String tipol;
            tipol = input.next();
            System.out.println("Qual e o nome do dono da conta?");
            this.dono = input.next();
            if (tipol.equals("cc") || tipol.equals("cp") || tipol.equals("CC") || tipol.equals("CP")) {
                setTipo(tipol);
                setStatus(true);
                if (tipol.equals("cc") || tipol.equals("CC")) {
                    setSaldo(this.saldo + 50);
                    System.out.println("CC aberta com sucesso! Foram adicionados 50 reais ao seu saldo.");
                    int numl;
                    numl = gen.nextInt(1000);
                    this.numConta = numl;
                } else {
                    setSaldo(this.saldo + 150);
                    System.out.println("CP aberta com sucesso! Foram adicionados 150 reais ao seu saldo.");
                    int numl;
                    numl = gen.nextInt(1000);
                    this.numConta = numl;
                }

            } else {
                System.out.println("Tipo invalido, digite apenas CC ou CP");
            }
        }

    }

    public void fecharConta() {
        if (this.status == false) {
            System.out.println("Esta conta ja esta fechada");
        } else if (this.status == true) {
            if (this.saldo > 0) {
                System.out.println("Voce deve sacar o dinheiro restante da sua conta para fecha-la");
            } else if (this.saldo < 0) {
                System.out.println("Voce nao pode fechar uma conta com saldo negativo");
            } else if (this.saldo == 0) {
                setStatus(false);
                System.out.println("Conta fechada com sucesso!");
                this.numConta = 0;
                this.dono = "CONTA FECHADA";
                this.tipo = "CONTA FECHADA";
            }
        }

    }

    public void depositar() {
        boolean statusl;
        statusl = isStatus();
        if (statusl == false) {
            System.out.println("Voce deve abrir sua conta antes de depositar dinheiro");
        } else {
            float valorl;
            System.out.println("Digite o quanto deseja depositar: ");
            valorl = input.nextFloat();
            setSaldo(this.saldo + valorl);
            System.out.println("Voce depositou " + valorl + " com sucesso! Seu saldo agora e de " + this.saldo + " R$");
        }
    }

    public void sacar() {
        float saldol;
        saldol = getSaldo();
        if (saldol == 0 || saldol < 0) {
            System.out.println("Voce nao pode sacar dinheiro de uma conta zerada ou negativa");
        } else {
            float valorl;
            System.out.println("Digite o quanto deseja sacar: ");
            valorl = input.nextFloat();
            if (valorl > this.saldo) {
                System.out.println("Voce nao tem dinheiro o suficiente para sacar " + valorl + " R$");
            } else {
                setSaldo(this.saldo - valorl);
                System.out.println("Voce sacou " + valorl + " com sucesso! Seu saldo agora e de " + this.saldo + " R$");
            }
        }
    }

    public void pagarMensal() {
        if (this.tipo.equals("cc") || this.tipo.equals("CC")) {
            if (this.saldo >= 12) {
                setSaldo(this.saldo - 12);
                System.out.println("Voce pagou 12 R$ de mensalidade! Seu saldo agora e de: " + this.saldo + " R$");
            } else {
                System.out.println("Voce nao tem o valor necessario (12R$) para pagar a mensalidade!");
            }
        } else {
            if (this.saldo >= 20) {
                setSaldo(this.saldo - 20);
                System.out.println("Voce pagou 20 R$ de mensalidade! Seu saldo agora e de: " + this.saldo + " R$");
            } else {
                System.out.println("Voce nao tem o valor necessario (20R$) para pagar a mensalidade!");
            }
        }
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void showInfo() {
        System.out.println("Numero da conta: " + this.numConta);
        if (this.tipo.equals("cc") || this.tipo.equals("CC")) {
            System.out.println("Tipo da conta: Conta Corrente");
        } else if (this.tipo.equals("cp") || this.tipo.equals("CP")) {
            System.out.println("Tipo da conta: Conta Poupanca");
        } else {
            System.out.println("Tipo da conta: CONTA FECHADA");
        }
        System.out.println("Dono da conta: " + this.dono);
        System.out.println("Saldo: " + this.saldo);
        if (this.status == true) {
            System.out.println("Status da conta: CONTA ABERTA");
        } else {
            System.out.println("Status da conta: CONTA FECHADA");
        }

    }

}
