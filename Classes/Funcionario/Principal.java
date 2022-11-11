import java.util.*;

public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Funcionario func1 = new Funcionario();

        System.out.print("Insira o nome do funcionário 1: ");
        func1.nome = scan.next();        
        System.out.print("Insira a quantidade de horas trabalhadas do funcionário 1: ");
        func1.horastrabalhadas = scan.nextDouble();
        System.out.print("Insira a valor/hora do funcionário 1: ");
        func1.valorDaHora = scan.nextDouble();

        Funcionario func2 = new Funcionario();
        System.out.print("\n\nInsira o nome do funcionário 2: ");
        func2.nome = scan.next();
        System.out.print("Insira a quantidade de horas trabalhadas do funcionário 2: ");
        func2.horastrabalhadas = scan.nextDouble();
        System.out.print("Insira a valor/hora do funcionário 2: ");
        func2.valorDaHora = scan.nextDouble();

        Funcionario func3 = new Funcionario();
        System.out.print("\n\nInsira o nome do funcionário 3: ");
        func3.nome = scan.next();
        System.out.print("Insira a quantidade de horas trabalhadas do funcionário 3: ");
        func3.horastrabalhadas = scan.nextDouble();
        System.out.print("Insira a valor/hora do funcionário 3: ");
        func3.valorDaHora = scan.nextDouble();

        
        System.out.printf("\nSalário final do funcionário %s: R$ %.2f\n\n", func1.nome, func1.salariofinal());
        
        System.out.printf("Salário final do funcionário %s: R$ %.2f\n\n", func1.nome, func2.salariofinal());

        System.out.printf("Salário final do funcionário %s: R$ %.2f\n\n", func1.nome, func3.salariofinal());



    }
}
