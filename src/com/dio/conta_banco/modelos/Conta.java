package com.dio.conta_banco.modelos;

import java.util.Scanner;

public class Conta {
    Scanner leitor = new Scanner(System.in);
    private int numeroConta;
    private int agencia;
    private String nomeCliente;
    private double saldo;

    public Conta() {
        System.out.println("Digite o número de sua conta:");
        this.numeroConta = leitor.nextInt();

        System.out.println("Digite o número de sua agência:");
        this.agencia = leitor.nextInt();

        System.out.println("Digite seu nome:");
        leitor.nextLine();
        this.nomeCliente = leitor.nextLine();

        System.out.println("Digite seu saldo:");
        this.saldo = leitor.nextDouble();
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
