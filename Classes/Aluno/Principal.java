import java.util.Scanner;

public class Principal {
    
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        Aluno al1 = new Aluno();

        System.out.print("Insira o nome do aluno 1: ");
        al1.nome = scan.nextLine();

        System.out.print("Insira a primeira nota do Aluno 1: ");
        al1.nota1 = scan.nextDouble();

        System.out.print("Insira a segunda nota do Aluno 1: ");
        al1.nota2 = scan.nextDouble();

        double mediaAl1 = al1.media();

        System.out.println("Média do Aluno 1: " + mediaAl1);
        al1.resultado();;
        
    }
}
