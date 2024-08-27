package Exec05;

public class FuncionarioGraduacao extends FuncionarioEnsinoMedio {
    protected String universidade;

    public FuncionarioGraduacao(String nome, String codigoFuncional, String escolaBasico, String escolaMedio, String universidade) {
        super(nome, codigoFuncional, escolaBasico, escolaMedio);
        this.universidade = universidade;
    }

    @Override
    public String toString() {
        return super.toString() + ", Universidade: " + universidade;
    }
}
