public class Funcionario {
    String nome;
    double horastrabalhadas;
    double valorDaHora;

    public double salariofinal() {
        return ((horastrabalhadas * valorDaHora) * 0.89);
    }
}

