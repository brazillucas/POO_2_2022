// Escreva um programa para ler o número total de eleitores de um município, o número de votos brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total de eleitores.

import java.util.Scanner;

public class PercentualEleitores {

    public static void main( String[] args) {

        try(Scanner entrada = new Scanner(System.in)) {

            System.out.printf("Insira o total de eleitores: ");
            double totalEleitores = entrada.nextDouble();
            System.out.printf("Insira o total de votos em branco: ");
            double votosBrancos = entrada.nextDouble();
            System.out.printf("Insira o total de votos nulos: ");
            double votosNulos = entrada.nextDouble();

            double votosValidos = totalEleitores - (votosBrancos + votosNulos);

            double percentBrancos = (votosBrancos / totalEleitores) * 100;
            double percentNulos = (votosNulos / totalEleitores) * 100;
            double percentValidos = (votosValidos / totalEleitores) * 100;

            System.out.println();
            System.out.printf("Percentual de votos brancos: %.2f%%", percentBrancos);
            System.out.println();
            System.out.printf("Percentual de votos nulos: %.2f%%", percentNulos);

            System.out.println();
            System.out.printf("Total de votos válidos: %.0f", votosValidos);
            System.out.println();
            System.out.printf("Percentual de votos válidos: %.2f%%", percentValidos);
            System.out.println();

        } finally {
            System.out.print("Programa Finalizado!\n");
        }
    }
}