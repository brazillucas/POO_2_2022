// O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%, escrever um programa para ler o custo de fábrica de um carro, calcular e escrever o custo final ao consumidor.

import java.util.Scanner;

public class CustoCarro {

    public static void main ( String[] args) {

        try(Scanner entrada = new Scanner(System.in)) {
            System.out.print("Digite o custo de fábrica do carro: R$");
            double custoFabrica = entrada.nextDouble();
            
            double percentDistribuidor = custoFabrica * 0.28;
            double percentImpostos = custoFabrica * 0.45;

            double valorFinal = custoFabrica + percentDistribuidor + percentImpostos;

            System.out.println();
            System.out.printf("O valor do distribuidor é: R$%.2f\n", percentDistribuidor);
            System.out.printf("O valor dos impostos é: R$%.2f\n", percentImpostos);

            System.out.println();
            System.out.printf("O valor final do carro é: R$%.2f\n", valorFinal);
        }
    }
}