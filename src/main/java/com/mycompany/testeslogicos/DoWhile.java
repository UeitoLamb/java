/*
 * TestesLogicos
 * CopyRight Rech Informática Ltda. Todos os direitos reservados.
 */
package com.mycompany.testeslogicos;

import java.util.Scanner;

/**
 * Descrição da classe.
 */
public class DoWhile {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("");
            System.out.println("Escolha uma opção");
            System.out.println("Soma 1");
            System.out.println("Opcao 2");
            System.out.println("Opcao 3");
            System.out.println("Sair - 0");

            System.out.println("");
            System.out.println("Opção: ");

            opcao = leitura.nextInt();

            if (opcao > 3) {
                System.out.println("Opção inválida");
            } else {
                System.out.println("Opção escolhida " + opcao);

            }

        } while (opcao != 0);

        System.out.println("");
//        do {
//            vezesExecucao = vezesExecucao + 1;
//            System.out.println("Execução número " + vezesExecucao);
//        } while (vezesExecucao < 10);
//        for (int vezesExecucao = 0; vezesExecucao <= 10; vezesExecucao++) {
//            System.out.println("Execução número " + vezesExecucao);
//        }

//        while (vezesExecucao < 10) {
//            vezesExecucao = vezesExecucao + 1;
//            System.out.println("Execução número " + vezesExecucao);
//        };
    }
}
