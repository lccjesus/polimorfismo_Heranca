package Exec05;

public class FuncionarioEnsinoBasico extends Funcionario {
    protected String escolaBasico;

    public FuncionarioEnsinoBasico(String nome, String codigoFuncional, String escolaBasico) {
        super(nome, codigoFuncional);
        this.escolaBasico = escolaBasico;
    }

    @Override
    public String toString() {
        return super.toString() + ", Escola (Ensino Básico): " + escolaBasico;
    }
}
