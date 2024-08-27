package Exec05;

public class Funcionario {
    protected String nome;
    protected String codigoFuncional;

    public Funcionario(String nome, String codigoFuncional) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Código Funcional: " + codigoFuncional;
    }
}
