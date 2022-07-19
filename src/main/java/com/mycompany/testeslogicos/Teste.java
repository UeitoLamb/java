/*
 * TestesLogicos
 * CopyRight Rech Informática Ltda. Todos os direitos reservados.
 */
package com.mycompany.testeslogicos;

import java.util.Scanner;

/**
 * Descrição da classe.
 */
public class Teste {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("--CALCULAMB--");

        System.out.println(" | 1 - Soma          | ");
        System.out.println(" | 2 - Subtração     | ");
        System.out.println(" | 3 - Divisao       | ");
        System.out.println(" | 4 - Multiplicação | ");
        System.out.println(" | 0 - Sair          |  ");

        System.out.println(" Digite a opção desejada:");
        int opcao = s.nextInt();

        System.out.println("");
        System.out.println("---CALCULAMB---");
        System.out.println(" 1 - Soma ");
        System.out.println(" 2 - Subtração ");
        System.out.println(" 3 - Divisao ");
        System.out.println(" 4 - Multiplicação ");
        System.out.println(" 0 - Sair");
        System.out.println(" Opção escolhida ---> " + opcao);

        double primeiroNumero;
        double segundoNumero;
        double resultadoOperação;

        switch (opcao) {
            case 1:
                System.out.println(" Informe o primeiro valor: ");
                primeiroNumero = s.nextDouble();
                System.out.println(" Informe o segundo valor para ser somado: ");
                segundoNumero = s.nextDouble();
                resultadoOperação = primeiroNumero + segundoNumero;
                System.out.
                        println(" O RESULTADO DA SOMA DE " + primeiroNumero + " + " + segundoNumero +
                                " É IGUAL A " +
                                resultadoOperação);
                break;
            case 2:
                System.out.println(" Informe o primeiro valor: ");
                primeiroNumero = s.nextDouble();
                System.out.println(" Informe o segundo valor para ser subtraido: ");
                segundoNumero = s.nextDouble();
                resultadoOperação = primeiroNumero - segundoNumero;
                System.out.
                        println(" O RESULTADO DA SUBTRAÇÃO DE " + primeiroNumero + " - " + segundoNumero +
                                " É IGUAL A " +
                                resultadoOperação);
                break;

            case 3:
                System.out.println(" Informe o primeiro valor : ");
                primeiroNumero = s.nextDouble();
                System.out.println(" Informe o segundo valor para ser dividido: ");
                segundoNumero = s.nextDouble();
                resultadoOperação = primeiroNumero / segundoNumero;
                System.out.
                        println(" O RESULTADO DA DIVISÃO DE " + primeiroNumero + " e " + segundoNumero +
                                " É IGUAL A " +
                                resultadoOperação);
                break;
            case 4:
                System.out.println(" informe o primeiro valor ");
                primeiroNumero = s.nextDouble();
                System.out.println(" Informe o segundo valor para ser multiplicado ");
                segundoNumero = s.nextDouble();
                resultadoOperação = primeiroNumero * segundoNumero;
                System.out.
                        println(" O RESULTADO DA MULTIPLICAÇÃO DE " + primeiroNumero + " . " + segundoNumero +
                                " É IGUAL A " +
                                resultadoOperação);
                break;
            case 0:
                System.out.
                        println(" VOCÊ SAIU DA CALCULADORA ");
                break;

            default:
                System.out.println(" OPÇÃO INVÁLIDA ");
        }

    }
}
