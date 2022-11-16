public class Paciente {
    String nome;
    String sexo;
    double peso;
    double altura;

    public double calcularIMC() {
        return peso / (altura * altura);
    }
}