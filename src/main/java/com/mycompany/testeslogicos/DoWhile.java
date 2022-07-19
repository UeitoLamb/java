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

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("");
        System.out.println("CALCULAMB");

        System.out.println("  1 - Soma           ");
        System.out.println("  2 - Subtração      ");
        System.out.println("  3 - Divisao        ");
        System.out.println("  4 - Multiplicação  ");
        System.out.println("  0 - Sair           ");
        System.out.println(" Digite a opção desejada:");

        int opcao = leitura.nextInt();
        String celeste = "\033[36m";
        do {

            if (opcao > 4) {
                System.out.println("Opção inválida");
            } else {
                System.out.println("Opção escolhida " + opcao);

                double primeiroNumero;
                double segundoNumero;
                double resultadoOperação;

                switch (opcao) {
                    case 1:
                        System.out.println(" Informe o primeiro valor: ");
                        primeiroNumero = leitura.nextDouble();
                        System.out.println(" Informe o segundo valor para ser somado: ");
                        segundoNumero = leitura.nextDouble();
                        resultadoOperação = primeiroNumero + segundoNumero;
                        System.out.println("");
                        System.out.
                                println(" O RESULTADO DA SOMA DE " + primeiroNumero + " + " + segundoNumero +
                                        " É IGUAL A " +
                                        resultadoOperação);
                        System.out.println("");
                        break;
                    case 2:
                        System.out.println(" Informe o primeiro valor: ");
                        primeiroNumero = leitura.nextDouble();
                        System.out.println(" Informe o segundo valor para ser subtraido: ");
                        segundoNumero = leitura.nextDouble();
                        resultadoOperação = primeiroNumero - segundoNumero;
                        System.out.println("");
                        System.out.
                                println(" O RESULTADO DA SUBTRAÇÃO DE " + primeiroNumero + " - " + segundoNumero +
                                        " É IGUAL A " +
                                        resultadoOperação);
                        System.out.println("");
                        break;

                    case 3:
                        System.out.println(" Informe o primeiro valor : ");
                        primeiroNumero = leitura.nextDouble();
                        System.out.println(" Informe o segundo valor para ser dividido: ");
                        segundoNumero = leitura.nextDouble();
                        resultadoOperação = primeiroNumero / segundoNumero;
                        System.out.println("");
                        System.out.
                                println(" O RESULTADO DA DIVISÃO DE " + primeiroNumero + " e " + segundoNumero +
                                        " É IGUAL A " +
                                        resultadoOperação);
                        System.out.println("");
                        break;
                    case 4:
                        System.out.println(" informe o primeiro valor ");
                        primeiroNumero = leitura.nextDouble();
                        System.out.println(" Informe o segundo valor para ser multiplicado ");
                        segundoNumero = leitura.nextDouble();
                        resultadoOperação = primeiroNumero * segundoNumero;
                        System.out.println("");
                        System.out.
                                println(" O RESULTADO DA MULTIPLICAÇÃO DE " + primeiroNumero + " . " + segundoNumero +
                                        " É IGUAL A " +
                                        resultadoOperação);
                        System.out.println("");
                        break;
                    case 0:
                        System.out.println("");
                        System.out.
                                println(" VOCÊ SAIU DA CALCULADORA ");
                        System.out.println("");
                        break;

                    default:
                        System.out.println(" OPÇÃO INVÁLIDA ");
                }

            }
            System.out.println("       _");
            System.out.println("      | |");
            System.out.println("     /  |____");
            System.out.println(" __ /      __|");
            System.out.println("|  |      ___|");
            System.out.println("|  |      ___|");
            System.out.println("|__|_________|");
            System.out.println("");
            System.out.println("--CALCULAMB--");
            System.out.println("Escolha uma opção");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Divisão");
            System.out.println("4 - Multiplicação");
            System.out.println("0 - Sair");
            System.out.println("");
            System.out.println("Opção desejada: " + opcao);

            opcao = (int) leitura.nextDouble();

        } while (opcao != 0);

    }
}
