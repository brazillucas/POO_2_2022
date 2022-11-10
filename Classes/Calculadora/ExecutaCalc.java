import java.util.*;

public class ExecutaCalc {
		
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Calculadora calc = new Calculadora();
		
		double num, num2;
		int opc = 0;
		
		while(opc != 5) {
			menu();
			
			opc = scan.nextInt();
			
			switch(opc) {
				case 1:
					System.out.print("Insira o primeiro número: ");
					num = scan.nextDouble();
					System.out.print("Insira o segundo número: ");
					num2 = scan.nextDouble();
					
					double soma = calc.somar(num, num2);
					
					System.out.printf("Resultado: " + soma);
					break;
				case 2:
					System.out.print("Insira o primeiro número: ");
					num = scan.nextDouble();
					System.out.print("Insira o segundo número: ");
					num2 = scan.nextDouble();
					
					double subtracao = calc.subtrair(num, num2);
					
					System.out.printf("Resultado: " + subtracao);
					
					break;
				case 3:
					System.out.print("Insira o multiplicador: ");
					num = scan.nextDouble();
					System.out.print("Insira o multiplicando: ");
					num2 = scan.nextDouble();
					
					double multiplicacao = calc.multiplicar(num, num2);
					
					System.out.printf("Resultado: " + multiplicacao);
					
					break;
				case 4:
					System.out.print("Insira o dividendo: ");
					num = scan.nextDouble();
					
					System.out.print("Insira o divisor: ");
					num2 = scan.nextDouble();
					
					double divisao = calc.dividir(num, num2);
					
					System.out.printf("Resultado: " + divisao);
					
					break;
				case 5:
					break;
				default:
					System.out.println("Opção inválida!");
					break;
			}
		}
		
		System.out.println("Obrigado por usar a nossa calculadora!");
	}
	
	private static void menu () {
		//clearConsole();
		
		System.out.println("\n1 - Somar\n2 - Subtrair\n3 - Multiplicar\n4 - Dividir\n5 - Sair");
		System.out.print("Escolha a função que deseja usar: ");		
	}
	
	private static void clearConsole() {
		System.out.print("\033[H\033[2J");
		System.out.flush();  
	}
}
