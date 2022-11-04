import java.util.Scanner;

public class Retangulo {
    public static void main( String[] args ) {
        
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.printf("Digite a base do retângulo: ");
            double base = entrada.nextDouble();
            System.out.printf("Digite a altura do retângulo: ");
            double altura = entrada.nextDouble();
            double area = base * altura;
            double perimetro = 2 * (base + altura);
            System.out.println("A area do retangulo é: " + area);
            System.out.println("O perímetro do retângulo é: " + perimetro);
        } finally {
            System.out.print("Programa Finalizado!");
        }
    }
}
