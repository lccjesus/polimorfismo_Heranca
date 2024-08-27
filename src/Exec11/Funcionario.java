package Exec11;

abstract class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public abstract double getComissao(); // Método abstrato para comissão

    public double getSalarioTotal() {
        return salario + getComissao();
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Comissão: " + getComissao() + ", Salário Total: " + getSalarioTotal();
    }
}

