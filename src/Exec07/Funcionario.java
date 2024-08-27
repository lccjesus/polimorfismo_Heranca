package Exec07;

class Funcionario {
    private String nome;
    private String nivelEscolaridade;
    private double salario;

    public Funcionario(String nome, String nivelEscolaridade, double salario) {
        this.nome = nome;
        this.nivelEscolaridade = nivelEscolaridade;
        this.salario = salario;
    }

    public String getNivelEscolaridade() {
        return nivelEscolaridade;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Escolaridade: " + nivelEscolaridade + ", Salário: " + salario;
    }
}

