package Exec09;

abstract class Comissao {
    private String nome;
    private double salarioBase;

    public Comissao(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    // Método abstrato para calcular o salário total
    public abstract double calcularSalarioTotal();

    @Override
    public String toString() {
        return "Nome: " + nome + ", Salário Base: R$ " + salarioBase + ", Salário Total: R$ " + calcularSalarioTotal();
    }
}
