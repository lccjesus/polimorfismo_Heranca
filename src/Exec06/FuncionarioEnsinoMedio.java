package Exec06;

public class FuncionarioEnsinoMedio extends FuncionarioEnsinoBasico {
    protected String escolaMedio;

    public FuncionarioEnsinoMedio(String nome, String codigoFuncional, String escolaBasico, String escolaMedio) {
        super(nome, codigoFuncional, escolaBasico);
        this.escolaMedio = escolaMedio;
    }

    @Override
    public double calcularRendaTotal() {
        return super.calcularRendaTotal() * 1.50;  // Aumenta a renda em 50% sobre a renda do Ensino Básico
    }

    @Override
    public String toString() {
        return super.toString() + ", Escola (Ensino Médio): " + escolaMedio;
    }
}
