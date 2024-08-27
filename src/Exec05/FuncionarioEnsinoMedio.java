package Exec05;

public class FuncionarioEnsinoMedio extends FuncionarioEnsinoBasico {
    protected String escolaMedio;

    public FuncionarioEnsinoMedio(String nome, String codigoFuncional, String escolaBasico, String escolaMedio) {
        super(nome, codigoFuncional, escolaBasico);
        this.escolaMedio = escolaMedio;
    }

    @Override
    public String toString() {
        return super.toString() + ", Escola (Ensino Médio): " + escolaMedio;
    }
}
