package com.dio.conta_banco.modelos;

import java.util.Scanner;

public class Conta {
    Scanner leitor = new Scanner(System.in);
    private int numeroConta;
    private int agencia;
    private String nomeCliente;
    private double saldo;

    private int InputUsuarioInt(String TextoParaImprimir) {
        while (true) {
            System.out.println(TextoParaImprimir);
            if (leitor.hasNextInt()) {
                return Integer.parseInt(leitor.nextLine());
            }
            System.out.println("Desculpe, mas houve um erro.");
            leitor.nextLine();
        }

    }

    public Conta() {
        this.numeroConta = InputUsuarioInt("Digite o número de sua conta:");
        this.agencia = InputUsuarioInt("Digite o número de sua agência:");

        while (true) {
            System.out.println("Digite seu nome:");
            this.nomeCliente = leitor.nextLine();

            if (!this.nomeCliente.isEmpty()) {
                break;
            }

            System.out.println("Desculpe, mas houve um erro.");
        }

        while (true) {
            System.out.println("Digite seu saldo:");
            if (leitor.hasNextDouble()) {
                this.saldo = Double.parseDouble(leitor.nextLine());
                break;
            }
            System.out.println("Desculpe, mas houve um erro.");
            leitor.nextLine();
        }
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }
}
