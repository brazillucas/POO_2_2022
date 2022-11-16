import java.util.Scanner;

public class Principal {
    public static void main (String[] args) {
        Paciente pac1 = new Paciente();

        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Insira o nome do paciente: ");
            pac1.nome = scan.nextLine();

            System.out.print("Insira o sexo do paciente: ");
            pac1.sexo = scan.nextLine();

            System.out.print("Insira o peso do paciente: ");
            pac1.peso = scan.nextDouble();

            System.out.print("Insira a altura do paciente: ");
            pac1.altura = scan.nextDouble();
        }

        Double imc = pac1.calcularIMC();

        if (imc < 18.5) {
            System.out.printf("Imc do paciente: %.2f\n", imc);
            System.out.printf("Magreza\n");
        } else if (imc >= 18.5 & imc < 25) {
            System.out.printf("Imc do paciente: %.2f\n", imc);
            System.out.printf("Normal\n");
        } else if (imc >= 25.0 & imc < 30) {
            System.out.printf("Imc do paciente: %.2f\n", imc);
            System.out.printf("Sobrepeso - Obesidade I\n");
        } else if (imc >= 30 & imc < 40) {
            System.out.printf("Imc do paciente: %.2f\n", imc);
            System.out.printf("Obesidade II\n");
        } else if (imc >= 40) {
            System.out.printf("Imc do paciente: %.2f\n", imc);
            System.out.printf("Obesidade Grave III\n");
        }
    }
}

/*
    IMC 	                Classificação 	    Obesidade (grau)
    Menor que 18,5 	        Magreza 	        0
    Entre 18,5 e 24,9 	    Normal 	            0
    Entre 25,0 e 29,9 	    Sobrepeso 	        I
    Entre 30,0 e 39,9 	    Obesidade 	        II
    Maior que 40,0 	        Obesidade Grave 	III
 */