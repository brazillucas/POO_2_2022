public class Aluno {
    String nome;
    double nota1, nota2;
    
    public double media () {
        return ((nota1 + nota2) / 2);
    }

    public void resultado  () {
        double mediaAluno = media();

        if (mediaAluno >= 6) {
            System.out.println("Aluno Aprovado!");
        } else {
            System.out.println("Aluno Reprovado!");
        }
    }
}