package Exec06;

public class FuncionarioEnsinoBasico extends Funcionario {
    protected String escolaBasico;

    public FuncionarioEnsinoBasico(String nome, String codigoFuncional, String escolaBasico) {
        super(nome, codigoFuncional);
        this.escolaBasico = escolaBasico;
    }

    @Override
    public double calcularRendaTotal() {
        return super.calcularRendaTotal() * 1.10;  // Aumenta a renda em 10%
    }

    @Override
    public String toString() {
        return super.toString() + ", Escola (Ensino Básico): " + escolaBasico;
    }
}
