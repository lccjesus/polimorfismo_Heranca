package Exec06;

public class FuncionarioGraduacao extends FuncionarioEnsinoMedio {
    protected String universidade;

    public FuncionarioGraduacao(String nome, String codigoFuncional, String escolaBasico, String escolaMedio, String universidade) {
        super(nome, codigoFuncional, escolaBasico, escolaMedio);
        this.universidade = universidade;
    }

    @Override
    public double calcularRendaTotal() {
        return super.calcularRendaTotal() * 2.00;  // Aumenta a renda em 100% sobre a renda do Ensino Médio
    }

    @Override
    public String toString() {
        return super.toString() + ", Universidade: " + universidade;
    }
}